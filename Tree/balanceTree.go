package Tree

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func IsBalanced(root *TreeNode) bool {
	if root == nil {
		return true
	}
	rDepth := getDepth(root.Right)
	lDepth := getDepth(root.Left)
	// 左右节点差距小于1
	return abs(rDepth, lDepth) <= 1 && IsBalanced(root.Left) && IsBalanced(root.Right)

}

func abs(a, b int) int {
	if a-b < 0 {
		return b - a
	}
	return a - b
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func getDepth(tree *TreeNode) int {
	if tree == nil {
		return 0
	}

	depth := max(getDepth(tree.Left), getDepth(tree.Right)) + 1
	return depth
}
