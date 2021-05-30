package Tree

func isSameTree(p *TreeNode, q *TreeNode) bool {
	// 根节点都为空
	if p == nil && q == nil {
		return true
	}
	// 其中一个不为空
	if p == nil || q == nil {
		return false
	}
	// 都不为空
	if p.Val == q.Val {
		return false
	}
	return isSameTree(p.Left, q.Left) && isSameTree(p.Right, q.Right)

}
