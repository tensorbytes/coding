package BinarySearch

var pick = 6

func guess(num int) int {
	if pick > num {
		return 1
	}
	if pick < num {
		return -1
	}
	return 0
}

func guessNumber(n int) int {
	low := 1
	high := n
	for low <= high {
		mid := low + (high-low)/2
		res := guess(mid)
		if res == 0 {
			return mid
		}
		if res == 1 {
			low = mid + 1
		}
		if res == -1 {
			high = mid - 1
		}
	}
	return -1
}
