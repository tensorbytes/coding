package stack

import (
	"math"
)

func dailyTemperatures(temperatures []int) []int {
	length := len(temperatures)
	res := make([]int, length)
	next := make([]int, 101)
	for i := 0; i < 101; i++ {
		next[i] = math.MaxInt32
	}
	for i := length - 1; i >= 0; i-- {
		warmerIndex := math.MaxInt32
		for t := temperatures[i] + 1; t <= 100; t++ {
			if next[t] < warmerIndex {
				warmerIndex = next[t]
			}
		}
		if warmerIndex < math.MaxInt32 {
			res[i] = warmerIndex - i
		}
		next[temperatures[i]] = i
	}
	return res
}
