package sort

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestHIndex(t *testing.T) {
	assert.Equal(t, 3, HIndex([]int{3, 0, 6, 1, 5}))
	assert.Equal(t, 1, HIndex([]int{1}))
	assert.Equal(t, 0, HIndex([]int{0}))
	assert.Equal(t, 1, HIndex([]int{0, 1}))
	assert.Equal(t, 1, HIndex([]int{1, 3, 1}))
}
