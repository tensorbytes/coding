package BinarySearch

// leetcode官方提供的方法
func isBadVersion(version int) bool {
	return true
}

func firstBadVersion(n int) int {
	if n == 1 {
		return 1
	}
	max := n
	min := 1
	for {
		mid := (max + min) / 2
		if isBadVersion(mid) {
			max = mid
		} else {
			min = mid + 1
		}
		if min >= max {
			return min
		}

	}
}
