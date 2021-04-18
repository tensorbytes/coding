package ListNode

/**
 * 解法一：递归
 */
func mergeTwoLists(l1 *ListNode, l2 *ListNode) *ListNode {
	if l1 == nil {
		return l2
	}
	if l2 == nil {
		return l1
	}
	if l1.Val > l2.Val {
		l2.Next = mergeTwoLists(l1, l2.Next)
		return l2
	} else {
		l1.Next = mergeTwoLists(l1.Next, l2)
		return l1
	}

}

/**
 * 解法二：循环判断
 */
func mergeTwoLists2(l1 *ListNode, l2 *ListNode) *ListNode {
	if l1 == nil {
		return l2
	}
	if l2 == nil {
		return l1
	}
	var result = &ListNode{
		0,
		nil,
	}
	cur := result
	for l1 != nil && l2 != nil {
		if l1.Val > l2.Val {
			cur.Next = l2
			cur = l2
			l2 = l2.Next
		} else if l1.Val < l2.Val {
			cur.Next = l1
			cur = l1
			l1 = l1.Next
		} else {
			cur.Next = l1
			cur = l1
			l1 = l1.Next
			cur.Next = l2
			cur = l2
			l2 = l2.Next
		}
	}
	// 其中一个为空，另一个可以直接添加到后面
	if l1 == nil {
		cur.Next = l2
	} else {
		cur.Next = l1
	}
	return result.Next

}
