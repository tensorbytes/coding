package Binary

func hammingWeight(num uint32) int {
	var res = 0
	for {
		if num == 0 {
			break
		}
		res = res + 1
		var subnum = num - 1
		num = num & subnum
	}
	return res
}
