package Binary

func missingNumber(nums []int) int {
	length := len(nums)
	sum1, sum2 := length, 0
	for i := 0; i < length; i++ {
		sum1 += i
		sum2 += nums[i]
	}
	return sum1 - sum2

}
