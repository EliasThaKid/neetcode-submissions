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
        ListNode dummy = new ListNode(0, head);
        ListNode curr = dummy.next;
        int l = 0;

        while (curr != null) {
            curr = curr.next;
            l++;
        }

        if (n == l) {
            return head.next;
        }

        int indexToRemove = l-n;
        curr = dummy.next;

        for (int i = 0; i < indexToRemove-1; i++) {
            curr = curr.next;
        }
        ListNode temp = curr.next.next;
        curr.next = temp;
        
        return head;
    }
}
