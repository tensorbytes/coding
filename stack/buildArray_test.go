package stack

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestBuildArray(t *testing.T) {
	res := buildArray([]int{1, 3}, 3)
	assert.Equal(t, []string{"Push", "Push", "Pop", "Push"}, res)
}
