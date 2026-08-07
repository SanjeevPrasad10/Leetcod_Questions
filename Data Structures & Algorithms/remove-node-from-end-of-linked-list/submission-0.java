/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Creating a dummy node that exists before the head node
       ListNode dummyNode = new ListNode(-1);

       ListNode slow = dummyNode;
       ListNode fast = dummyNode;
       dummyNode.next = head;

       for(int i = 0; i<=n; i++){
        //Move the pointer by n+1
        //So that slow will point exact to the node thats next
        //Next node is to be remove
            fast = fast.next;
       }

       //Now just take both pointers altogether
       while(fast != null){
            slow = slow.next;
            fast = fast.next;
       }

       //Remove the next node from the slow

       slow.next = slow.next.next;

       return dummyNode.next;
    }
}
