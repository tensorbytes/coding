package ListNode

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
// 回文链表
func isPalindrome(head *ListNode) bool {
	// 快慢指针找到中间值
	slow := head
	fast := head
	for fast != nil && fast.Next != nil {
		slow = slow.Next
		fast = fast.Next.Next
	}

	mid := slow

	var last *ListNode
	p := slow
	// 后半段反转
	for p != nil {
		tmp := p.Next
		p.Next = last
		last = p
		p = tmp
	}
	// 前后对比
	mid.Next = nil
	for head != nil && last != nil {
		if head.Val != last.Val {
			return false
		}
		head = head.Next
		last = last.Next
	}
	return true
}
