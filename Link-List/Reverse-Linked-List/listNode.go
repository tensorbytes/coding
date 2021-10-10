package ListNode


type ListNode struct {
    Val int
    Next *ListNode
}"
)

func conv2ListNode(head *ListNode) (array []int) {
	node := head
	for node != nil {
		array = append(array, node.Val)
		node = node.Next
	}
	return
}

func TestReverseList(t *testing.T) {
	node1 := &ListNode{Val: 1}
	node2 := &ListNode{Val: 2}
	node3 := &ListNode{Val: 3}
	node4 := &ListNode{Val: 4}
	node5 := &ListNode{Val: 5}
	node1.Next, node2.Next, node3.Next, node4.Next = node2, node3, node4, node5
	node5.Next = nil
	reverNode := ReverseList(node1)
	res := conv2ListNode(reverNode)
	assert.Equal(t, []int{5, 4, 3, 2, 1}, res)

}
