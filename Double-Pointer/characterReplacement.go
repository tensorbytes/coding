package DoublePointer

func characterReplacement(s string, k int) int {
	var res int
	var left int
	var right int
	var counter int
	var freq [26]int

	for right = 0; right < len(s); right++ {
		freq[s[right]-'A']++
		counter = max(counter, freq[s[right]-'A'])
		// 窗口大小 - 窗口中出现最高频次的元素 > k 时，左窗口右移
		for right-left+1-counter > k {
			freq[s[left]-'A']--
			left++
		}
		res = max(res, right-left+1)
	}

	return res
}

func max(a, b int) int {
	if a < b {
		a = b
	}
	return a
}
