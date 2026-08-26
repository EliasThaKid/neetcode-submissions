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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {return false;}
        HashSet<ListNode> node = new HashSet<>();
        ListNode curr = head;
        while (curr != null ) {
            if (node.contains(curr)) {
                return true;
            } else {
                node.add(curr);
                curr = curr.next;
            }
        }  
        return false;
    }
}
