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
        HashMap<Integer, ListNode> nodeIndex = new HashMap<>();
        // int index = n+1;
        int l = 0;
        ListNode curr = head; 
        while (curr != null) {
            nodeIndex.put(l, curr);
            l++;
            curr = curr.next;
        }
                // Calculate the index of the node to remove
        int indexToRemove = l - n;

        // If the node to remove is the head, return the next node
        if (indexToRemove == 0) {
            return head.next;
        }

        // Adjust the pointers to remove the node
        if (indexToRemove > 0) {
            nodeIndex.get(indexToRemove - 1).next = nodeIndex.get(indexToRemove).next;
        }

        return head;
    }
}
