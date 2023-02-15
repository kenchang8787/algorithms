import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        List<Integer> vals = new ArrayList<>();

        while (head != null) {
            vals.add(head.val);
            head = head.next;
        }

        int len = vals.size();

        if (len == 1)
            return null;

        if (n == 1) {
            vals.remove(len - n);
        } else {
            vals.set(len - n, vals.get(len - n + 1));
            vals.remove(len - n + 1);

        }

        head = new ListNode();

        for (int i = len - 2; i >= 0; i--) {
            head.next = new ListNode(vals.get(i), head.next);
        }

        return head.next;
    }

}