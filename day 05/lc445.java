// 445. Add Two Numbers II

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2 ;
        if(l2 == null) return l1;
        
      ListNode r1= reverse(l1);
      ListNode r2 =   reverse(l2);
         reverse(l1);
        reverse(l2);
     ListNode a1 = revass(r1,r2);
        return reverse(a1);
    }
    public ListNode reverse (ListNode r1)  {
        if(r1 == null || r1.next == null) return r1;
        ListNode prev = null , curr = r1;
        while(curr != null){
            ListNode forw = curr.next;
            
            curr.next = prev ;
            prev = curr ;
            curr = forw;
        }
       return prev; 
    }
        
  
    public ListNode revass(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        ListNode itr = dummy ;
        
        int carry = 0 ;
        while(l1 != null || l2 != null || carry ==1 ){
            int sum = 0 ;
            if(l1 != null){
              sum += l1.val; 
                l1 = l1.next;
            }
            if( l2 != null){
               sum += l2.val;
                l2 = l2.next;
            }
            sum += carry ;
            carry = sum/10;
            ListNode ans = new ListNode(sum%10);
            itr.next = ans;
            itr = itr.next;
        }
        return dummy.next;
}
}