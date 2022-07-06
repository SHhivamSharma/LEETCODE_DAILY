//141. Linked List Cycle

public class Solution {
    public boolean hasCycle(ListNode head) {
               if(head == null || head.next == null  ) return false;

           ListNode slow =head;
         ListNode fast = head.next;
//          while(slow!=fast){
//              if(fast==null || fast.next== null) {
//                  return false;
                 
//              }
             
//              slow=slow.next;
//              fast= fast.next.next ;
//          }
//         return true;
        
        // sol 2
        while(fast.next!= null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
       return false ; 
    }
}