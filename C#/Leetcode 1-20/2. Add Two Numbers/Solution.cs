/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution
{
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2)
    {
        return new ListNode();
    }
}

public class ListNode
{
    public int val;
    public ListNode? next;
    public ListNode(int val = 0, ListNode? next = default)
    {
        this.val = val;
        this.next = next;
    }


    public ListNode(int[] array)
    {
        ListNode? result = null;

        for (int i = 0; i < array.Length; i++)
        {
            var node = new ListNode(array[i], result);

            result = node;
        }

        if (result == null)
        {
            this.val = 0;
            this.next = default;
        }
        else
        {
            this.val = result.val;
            this.next = result.next;
        }
    }

    public override string ToString()
    {
        var list = new List<int>();

        ListNode? listNode = this;

        while (listNode != null)
        {
            list.Add(listNode.val);
            listNode = listNode.next;
        }

        return string.Join(" ", list.ToArray());
    }
}