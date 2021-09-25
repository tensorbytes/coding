func twoSum(nums []int, target int) []int {
	m := make(map[int]int)
	for i, v := range nums{
		find := target - v
		if _, ok := m[find];ok{
			return []int{m[find], i}
		}
		m[v] = i
	}
	return nil

}