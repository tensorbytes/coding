package Binary

func addBinary(a string, b string) string {
	la, lb := len(a), len(b)
	// 确保a比b长
	if lb > la {
		la, lb = lb, la
		a, b = b, a
	}
	c := []byte(a)
	var temp byte = 0              // 判断是否进一,1为进一
	for i := la - 1; i >= 0; i-- { // 从后往前遍历
		// a[i]是字符编码不是数字,所以要减去字符'0'的编码
		sum := a[i] - '0' + temp
		if j := lb + i - la; j >= 0 {
			sum += b[j] - '0'
		}
		temp = sum / 2     // 只有sum为2时,temp才等于1
		c[i] = sum%2 + '0' // c需要存储字符编码,所以要加上'0'
	}
	res := string(c)
	// 特殊处理,当第一位需要进一时
	if temp == 1 {
		res = "1" + res
	}
	return res
}
