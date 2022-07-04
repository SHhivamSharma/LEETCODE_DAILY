// 23

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null ;
        return mergek(lists ,0 , lists.length-1);
        
        
    }
    public ListNode mergek(ListNode [] list , int si , int ei ){
        if(si >ei) return null;
        if(si == ei) return list[si];
        int mid = (si+ei)/2;
        ListNode l1 = mergek(list,si,mid);
        ListNode l2 = mergek(list ,mid+1 , ei);
        
        return merge2(l1,l2);
    }
    public ListNode merge2(ListNode l1 , ListNode l2 ){
        if(l1 == null) return l2;
        if(l2 == null) return l1 ;
        
        ListNode c1 = l1 ;
         ListNode c2 = l2 ;
        
        ListNode ans = new ListNode(-1);
        ListNode dum = ans ;
        while (c1 != null && c2 != null){
            if(c1.val <c2.val){
                dum.next=c1;
                c1=c1.next;
            }else {
                dum.next=c2;
                c2=c2.next;
            }
            dum = dum.next;
        }
        dum.next = c1 != null?c1:c2;
        
        return ans.next;
    }
}

// solution 2 of this question 
//  public ListNode mergeKLists(ListNode[] arr) {
//         if(arr.length == 0)return null;
//         int ei = arr.length-1;
//         while(ei != 0){
//             int i=0, j= ei;
//             while(i<j){
//                 arr[i] = mergeTwoLists(arr[i],arr[j]);
//                 i++;
//                 j--;
                
//                 if(i>=j){ ei = j; }
//             }            
//         }
//         return arr[0];
//     }
    
//     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//         ListNode c1 = l1, c2 =l2;
//         ListNode temp = new ListNode(-1,null), ans = temp;
//         while(c1 != null && c2 != null){
//             if(c1.val <= c2.val){
//                 temp.next = c1; c1 = c1.next;
//             }else{
//                 temp.next = c2; c2 = c2.next;
//             }
//             temp = temp.next;
//         }
//         temp.next = (c1 == null) ? c2 : c1;
//         ans = ans.next;
//         return ans;
//     }