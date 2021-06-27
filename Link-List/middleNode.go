package ListNode

// 快慢指针计算中间节点
func middleNode(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}
	fast := head
	slow := head
	for fast != nil && fast.Next != nil {
		fast = fast.Next.Next
		slow = slow.Next
	}
	return slow
}
