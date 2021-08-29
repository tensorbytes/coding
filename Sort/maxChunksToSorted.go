package sort

func maxChunksToSorted(arr []int) int {
	var res int
	var len = len(arr)
	for i := 0; i < len; i++ {
		bound := arr[i]
		if bound == i {
			res = res + 1
		}
		for j := i; j <= bound; j++ {
			// 等于边界值，说明便利完了一个块
			if (arr[j] < j) && (j == bound) {
				res = res + 1
			}
			if arr[j] > bound {
				bound = arr[j]
			}
			i = j
		}
	}
	return res
}
