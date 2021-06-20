package ListNode

/* 这是一道利用递归排序对链表进行排序的算法题
 */

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func sortList(head *ListNode) *ListNode {
	if head == nil {
		return head
	}
	length := 0
	for node := head; node != nil; node = node.Next {
		length++
	}
	dummyhead := &ListNode{Next: head}
	for sublength := 1; sublength < length; sublength <<= 1 {
		prev, cur := dummyhead, dummyhead.Next
		for cur != nil {
			head1 := cur
			for i := 1; i < sublength && cur.Next != nil; i++ {
				cur = cur.Next
			}
			head2 := cur.Next
			cur.Next = nil
			cur = head2

			for i := 1; i < sublength && cur != nil && cur.Next != nil; i++ {
				cur = cur.Next
			}
			var next *ListNode
			if cur != nil {
				next = cur.Next
				cur.Next = nil
			}
			prev.Next = merge(head1, head2)
			for prev.Next != nil {
				prev = prev.Next
			}
			cur = next
		}
	}
	return dummyhead.Next
}
func merge(head1, head2 *ListNode) *ListNode {
	dummyhead := &ListNode{}
	temp, temp1, temp2 := dummyhead, head1, head2
	for temp1 != nil && temp2 != nil {
		if temp1.Val <= temp2.Val {
			temp.Next = temp1
			temp1 = temp1.Next
		} else {
			temp.Next = temp2
			temp2 = temp2.Next
		}
		temp = temp.Next
	}
	if temp1 != nil {
		temp.Next = temp1
	} else {
		temp.Next = temp2
	}
	return dummyhead.Next
}
