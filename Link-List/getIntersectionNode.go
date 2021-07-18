package ListNode

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

func getIntersectionNode(headA, headB *ListNode) *ListNode {
	nodeA, nodeB := headA, headB
	flag := false
	for nodeA != nodeB {
		if nodeA.Next == nil {
			if flag {
				nodeA = nil
				break
			}
			flag = true
			nodeA = headB
		} else {
			nodeA = nodeA.Next
		}
		if nodeB.Next == nil {
			nodeB = headA
		} else {
			nodeB = nodeB.Next
		}
	}
	return nodeA
}
