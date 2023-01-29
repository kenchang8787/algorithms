package main

import "fmt"

func main() {

	var result = new(ListNode)

	fmt.Println(result)
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {

	return listNodeSum(l1, l2)
}

func listNodeSum(listNode1 *ListNode, listNode2 *ListNode) *ListNode {

	var result = new(ListNode)

	if listNode1 != nil && listNode2 != nil {
		result = newListNode(listNode1.Val + listNode2.Val)

		// 處理進位
		if result.Val > 9 {
			result.Val -= 10

			if listNode1.Next != nil {
				listNode1.Next.Val += 1
			} else {
				listNode1.Next = newListNode(1)
			}
		}

		// 繼續處理下一位數
		result.Next = listNodeSum(listNode1.Next, listNode2.Next)
	} else if listNode1 != nil && listNode2 == nil {
		result = listNodeSum(listNode1, newListNode(0))
	} else if listNode1 == nil && listNode2 != nil {
		result = listNodeSum(newListNode(0), listNode2)
	}

	return result
}

func newListNode(val int) *ListNode {
	return &ListNode{
		Val: val,
	}
}

// Definition for singly-linked list.
type ListNode struct {
	Val  int
	Next *ListNode
}
