package DoublePointer

func removeDuplicates(nums []int) int {
	n := len(nums)
	if n < 1 {
		return len(nums)
	}
	slow := 1
	for fast := 1; fast < n; fast++ {
		if nums[fast] != nums[fast-1] {
			nums[slow] = nums[fast]
			slow++
		}
	}
	return slow
}
