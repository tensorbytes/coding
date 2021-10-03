package DoublePointer

func countGoodSubstrings(s string) int {
	length := len(s)
	if length < 3 {
		return 0
	}
	res := 0
	for i := 0; i < length-2; i++ {
		if (s[i] == s[i+1]) || (s[i+1] == s[i+2]) || (s[i] == s[i+2]) {
			continue
		} else {
			res++
		}
	}
	return res

}
