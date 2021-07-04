package other

func plusOne(digits []int) []int {
	for i := len(digits) - 1; i >= 0; i = i - 1 {
		digits[i] = digits[i] + 1
		digits[i] = digits[i] % 10
		if digits[i] != 0 {
			return digits
		}
	}
	res := make([]int, len(digits)+1)
	res[0] = 1 //首位设置为1
	return res
}
