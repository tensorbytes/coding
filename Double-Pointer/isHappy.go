package DoublePointer

func isHappy(n int) bool {
	fast, slow := cal(n), n
	for fast != 1 && fast != slow {
		fast = cal(cal(fast))
		slow = cal(slow)
	}
	return fast == 1
}

func cal(num int) int {
	sum := 0
	for num > 0 {
		sum += (num % 10) * (num % 10)
		num /= 10
	}
	return sum
}
