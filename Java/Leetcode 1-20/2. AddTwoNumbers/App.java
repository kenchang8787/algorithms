
public class App {
    /*
     * 傳入兩個 single linked list, 表示一整數的位數
     * 例 [2, 4, 3] 即為整數 342
     * 求兩個list的整數相加
     */
    public static void main(String[] args) {

        var sol = new Solution();

        // example 1: [2,4,3], [5,6,4]
        var input1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        var input2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        printListNode(sol.addTwoNumbers(input1, input2));

        // example 2: [0], [0]
        var input3 = new ListNode(0);
        var input4 = new ListNode(0);
        printListNode(sol.addTwoNumbers(input3, input4));

        // example 3: [9,9,9,9,9,9,9], [9,9,9,9]
        var input5 = new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        var input6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        printListNode(sol.addTwoNumbers(input5, input6));

        // example 4
        var input7 = new ListNode(9);
        var input8 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9,
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        printListNode(sol.addTwoNumbers(input7, input8));
    }

    public static void printListNode(ListNode listNode) {

        System.out.print("[");

        ListNode temp = listNode;

        while (temp != null) {
            System.out.print(Integer.toString(temp.val));

            temp = temp.next;

            if (temp != null)
                System.out.print(",");
        }

        System.out.print("]\n");
    }
}
