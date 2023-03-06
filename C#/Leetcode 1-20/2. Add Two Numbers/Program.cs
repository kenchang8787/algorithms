

Solution sol = new Solution();

// 1, [7,0,8]
Console.WriteLine(
    sol.AddTwoNumbers(
        new ListNode(new int[] { 2, 4, 3 }),
        new ListNode(new int[] { 5, 6, 4 }))
        .ToString());
// 2, [0]
Console.WriteLine(
    sol.AddTwoNumbers(
        new ListNode(new int[] { 0 }),
        new ListNode(new int[] { 0 }))
        .ToString());
// 3, [8,9,9,9,0,0,0,1]
Console.WriteLine(
    sol.AddTwoNumbers(
        new ListNode(new int[] { 9, 9, 9, 9, 9, 9, 9 }),
        new ListNode(new int[] { 9, 9, 9, 9 }))
        .ToString());



