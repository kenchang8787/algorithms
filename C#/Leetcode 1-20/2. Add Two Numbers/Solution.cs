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
    /// <summary>
    /// 給定兩個 Single Linked List，每個單鏈結構代表一 "整數位數的反向"
    /// 例如 int a = 123 則表示為 (3)->(2)->(1), ()=val, ->=next
    /// 求兩個整數相加, 並返回用單鏈結構。
    /// 假設單鏈結構表示的整數，不會有 0 作為第一個數，即不會有 0123 這樣的值。
    /// </summary>
    /// <param name="l1"></param>
    /// <param name="l2"></param>
    /// <returns></returns>
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2)
    {
        // # 思路
        // 兩個整數相加，必然會有進位的問題要處理
        // 例如假設兩個整數為 916 + 85 = 1001
        // 又因單鏈結構記錄整數位數的反向, 故 (6)->(1)->(9) + (5)->(8) = (1)->(0)->(0)->(1)
        // 那看起來我們可以將問題拆至每次只處理一個位數，並處理此位數的進位(next.val + 1)
        // 故結論用recursion去處理每一位數
        // # 註: 若此單鏈結構不是紀錄 整數位數的反向，則不可用此方式解決，因為不是從個位數開始

        var result = recursion(l1, l2);

        return result == null ? new ListNode(0) : result;
    }

    private ListNode? recursion(ListNode? l1, ListNode? l2)
    {
        ListNode? result = null;

        // 只有這個條件下才有進位問題要處理
        if (l1 != null && l2 != null)
        {
            result = new ListNode(l1.val + l2.val);

            // 處理進位
            if (result.val > 9)
            {
                result.val -= 10;

                if (l1.next != null) l1.next.val += 1;
                else l1.next = new ListNode(1);
            }

            // 處理下一個位數, 當兩個單鏈結構的 next 都是 null 時, 為遞迴的中止點
            result.next = recursion(l1.next, l2.next);
        }
        else if (l1 != null && l2 == null)
        {
            // 這樣做是為了讓遞迴走到 l1 != null && l2 != null
            result = recursion(l1, new ListNode(0));
        }
        else if (l1 == null && l2 != null)
        {
            // 這樣做是為了讓遞迴走到 l1 != null && l2 != null
            result = recursion(l2, new ListNode(0));
        }

        return result;
    }
}

