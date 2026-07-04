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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;

        slow.next = null;
        ListNode prev = null;
        ListNode curr = head2;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // now prev is the reversed LL
        ListNode curr1 = head.next;
        ListNode curr2 = prev;
        ListNode tail = head;
        int counter = 0;
        while (curr1 != null && curr2 != null) {
            if (counter % 2 == 0) {
                tail.next = curr2;
                curr2 = curr2.next;
                tail = tail.next;
            } else {
                tail.next = curr1;
                curr1 = curr1.next;
                tail = tail.next;
            }
            counter++;
        }

        if (curr1 == null)
            tail.next = curr2;
        else if (curr2 == null)
            tail.next = curr1;
    }
}
