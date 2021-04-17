package ListNode

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func ReverseList(head *ListNode) *ListNode {
	cur := head
	var pre *ListNode = nil
	var tmpNext *ListNode
	for cur != nil {
		tmpNext = cur.Next
		cur.Next = pre
		pre = cur
		cur = tmpNext
	}
	return pre
}
