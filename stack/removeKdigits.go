package stack

import "strings"

func removeKdigits(num string, k int) string {
	stack := []byte{}
	for i := range num {
		for (len(stack) >= 1) && (num[i] < stack[len(stack)-1]) && (k > 0) {
			stack = stack[0 : len(stack)-1]
			k--
		}
		stack = append(stack, num[i])
	}
	// 特殊情况处理，比如前面有0
	stack = stack[:len(stack)-k]
	res := strings.TrimLeft(string(stack), "0")
	if res == "" {
		res = "0"
	}
	return res
}
