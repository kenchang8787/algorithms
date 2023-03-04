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
    public ListNode swapPairs(ListNode head) {

        // 宣告一個不變的頭節點, 方便後面移來移去
        ListNode firstNode = new ListNode();
        firstNode.next = head;

        // 目前處理的節點 1,2,3,4
        ListNode currNode = head;
        // 前一個節點 0,1,2,3,4
        ListNode prevNode = firstNode;
        // 用來儲存後面未處理的節點
        ListNode nextKeep;

        while (currNode != null && currNode.next != null) {
            // 3 -> 4
            nextKeep = currNode.next.next;
            // 1 -> 2 -> 1 ...
            currNode.next.next = currNode;
            // 0 -> 2 -> 1 -> 2 ...
            prevNode.next = currNode.next;
            // 0 -> 2 -> 1 -> 3 -> 4
            currNode.next = nextKeep;

            // 處理下一組
            // 1 -> 3 -> 4
            prevNode = currNode;
            // 3 -> 4
            currNode = currNode.next;
        }

        return firstNode.next;
    }
}