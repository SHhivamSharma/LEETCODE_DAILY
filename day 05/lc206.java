// 206. Reverse Linked List
class Solution {
    public ListNode reverseList(ListNode head) {
        // ListNode newhead = null;
        // while(head!= null){
        //     ListNode next = head.next;
        //     head.next = newhead;
        //     newhead = head ;
        //     head = next;
        // }
        // return newhead;
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
    }
    return prev;
}}