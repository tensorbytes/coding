package BinarySearch

func isPerfectSquare(num int) bool {
	if num < 2 {
		return true
	}

	left := 2
	right := num / 2

	for left <= right {
		x := left + (right-left)/2
		guess := x * x
		if guess == num {
			return true
		}
		if guess > num {
			right = x - 1
		} else {
			left = x + 1
		}
	}
	return false
}
