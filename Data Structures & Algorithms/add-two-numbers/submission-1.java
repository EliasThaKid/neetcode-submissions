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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carryOver = 0;

        while (l1 != null || l2 != null || carryOver != 0) {

            int l1Val = (l1 == null) ? 0 : l1.val;
            int l2Val = (l2 == null) ? 0 : l2.val;

            int currNodeVal = l1Val + l2Val + carryOver;
            if (carryOver != 0) { carryOver = 0; }

            if (currNodeVal < 10) {
                curr.next = new ListNode(currNodeVal);
            } else {
                curr.next = new ListNode(currNodeVal-10);
                carryOver++;
            }

            l1 = (l1 == null) ? l1 = null : l1.next;
            l2 = (l2 == null) ? l2 = null : l2.next;
            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        } else if (l2 != null) {
            curr.next = l2;
        } else {
            if (carryOver != 0) { curr.next = new ListNode(carryOver); }
        }

        return dummy.next;
    }
}
