import java.math.BigInteger;

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
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /**
         * 用遞迴的方式, 每次只處理當前的位數
         */

        return listNodeSum(l1, l2);
    }

    private ListNode listNodeSum(ListNode listNode1, ListNode listNode2) {

        ListNode result = null;

        // 若兩個list, 當前位數皆有值
        if (listNode1 != null && listNode2 != null) {
            // 當前位數相加
            result = new ListNode(listNode1.val + listNode2.val);

            // 若當前位數相加大於9, 則處理進位
            if (result.val > 9) {
                result.val -= 10;

                if (listNode1.next != null)
                    listNode1.next.val = listNode1.next.val + 1;
                else
                    listNode1.next = new ListNode(1);
            }

            // 繼續處理下一位數
            result.next = listNodeSum(listNode1.next, listNode2.next);
        }
        // 只有list1, 當前位數有值
        else if (listNode1 != null && listNode2 == null) {
            result = listNodeSum(listNode1, new ListNode(0));
        }
        // 只有list2, 當前位數有值
        else if (listNode1 == null && listNode2 != null) {
            result = listNodeSum(new ListNode(0), listNode2);
        }

        return result;
    }
}