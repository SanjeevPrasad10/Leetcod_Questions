/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        HashMap <Node,Node> map = new HashMap<>();

        //Copying into the map
        Node curr = head;
        while(curr != null){
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        //setting curr pointer to the head node once again for iteration
        curr = head;
        while(curr != null){
            Node clone = map.get(curr);
            clone.next = map.get(curr.next);

            clone.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}
