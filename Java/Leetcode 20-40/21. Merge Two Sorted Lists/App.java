class App {

    public static void main(String[] args) {

        Solution sol = new Solution();

        // 1, [1,1,2,3,4,4]
        printListNode(sol.mergeTwoLists(arrayToListNode(1, 2, 4), arrayToListNode(1, 3, 4)));
        // 2, []
        printListNode(sol.mergeTwoLists(arrayToListNode(), arrayToListNode()));
        // 3, [0]
        printListNode(sol.mergeTwoLists(arrayToListNode(), arrayToListNode(0)));
    }

    public static ListNode arrayToListNode(int... array) {

        if (array.length == 0)
            return new ListNode();

        ListNode result = new ListNode();

        for (int i = array.length - 1; i >= 0; i--) {
            result.next = new ListNode(array[i], result.next);
        }

        return result.next;
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