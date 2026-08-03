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
    public ListNode reverseList(ListNode head) {

        //Checking if the node is empty or not
        if(head == null){
            return null;
        }
        //Checking if there exists only one element in the memory
        if(head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        //Swapping pointers//
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
        return head;
    }
}
