package stack

func buildArray(target []int, n int) []string {
	stack := []string{}
	for i := 1; i <= n; i++ {
		if len(target) == 0 {
			return stack
		}
		value := target[0]
		if i == value {
			stack = append(stack, "Push")
			target = target[1:len(target)]
		} else {
			stack = append(stack, []string{"Push", "Pop"}...)
		}

	}
	return stack
}
