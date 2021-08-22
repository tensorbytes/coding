package BinarySearch

func searchMatrix(matrix [][]int, target int) bool {
	if len(matrix) == 0 || len(matrix[0]) == 0 {
		return false
	}
	m := len(matrix)
	n := len(matrix[0])
	i, j := m-1, 0
	for i >= 0 && j < n {
		if matrix[i][j] == target {
			return true
		} else if matrix[i][j] > target {
			i -= 1
		} else {
			j += 1
		}
	}
	return false
}
