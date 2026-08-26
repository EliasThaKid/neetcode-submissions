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
        HashMap<Node, Node> ogList = new HashMap<>();
        //init for if the curr in the list asks for a random.
        ogList.put(null, null);
        Node curr = head;
        //first pass we add node values using curr as the key
        while (curr != null) {
            Node newNode = new Node(curr.val);
            ogList.put(curr, newNode);
            curr = curr.next;
        }
        // now we initialize the whole list with the pointers because 
        // we have all the nodes
        curr = head;
        while (curr != null) {
            ogList.get(curr).next = ogList.get(curr.next);
            ogList.get(curr).random = ogList.get(curr.random);
            curr = curr.next;
        }


        return ogList.get(head);
       


    }
}
