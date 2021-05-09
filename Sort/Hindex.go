package sort

const INT_MAX = int(^uint(0) >> 1)
const INT_MIN = ^INT_MAX

// 对于指定范围数值排序可以用计数排序
// 计数排序适用于数据密集集中的排序
func HIndex(citations []int) int {
	length := len(citations)
	// length+1的原因是因为数组从零开始
	countArray := make([]int, length+1)
	for _, v := range citations {
		if v > length {
			countArray[length] = countArray[length] + 1
		} else {
			countArray[v] = countArray[v] + 1
		}
	}

	// 找出最大的h-index
	var hindex int = length
	var maxindex []int
	for i := range countArray {
		if hindex >= i {
			maxindex = append(maxindex, i)
		}
		hindex = hindex - countArray[i]
	}
	return len(maxindex) - 1

}

func Max(list []int) int {
	var length int = INT_MIN
	for _, v := range list {
		if v > length {
			length = v
		}
	}
	return length
}
