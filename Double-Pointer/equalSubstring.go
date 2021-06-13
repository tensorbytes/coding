package DoublePointer

func equalSubstring(s string, t string, maxCost int) int {
	var left, right, res int
	var tempCost int
	for right = 0; right < len(s); right++ {
		tempCost += abs(int(s[right]) - int(t[right]))
		for tempCost > maxCost && left <= right {
			tempCost -= abs(int(s[left]) - int(t[left]))
			left++
		}
		res = max(res, right-left+1)
	}
	return res
}

func abs(a int) int {
	if a < 0 {
		return -a
	}
	return a
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
