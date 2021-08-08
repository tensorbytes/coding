package stack

// 通过单调栈排查
func find132pattern(nums []int) bool {
	n := len(nums)
	stack := []int{}
	k := -1
	for index := n - 1; index >= 0; index-- {
		if k != -1 && nums[k] > nums[index] {
			return true
		}
		for len(stack) != 0 && nums[stack[len(stack)-1]] < nums[index] {
			k = stack[len(stack)-1]
			stack = stack[0 : len(stack)-1]
		}
		stack = append(stack, index)
	}
	return false
}
