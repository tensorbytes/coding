package stack

func nextGreaterElement(nums1 []int, nums2 []int) []int {
	for i, v1 := range nums1 {
		start := false
		for _, v2 := range nums2 {
			if v2 == v1 {
				start = true
			}
			if start && v2 > v1 {
				nums1[i] = v2
				break
			}
		}
		if nums1[i] == v1 {
			nums1[i] = -1
		}
	}

	return nums1
}
