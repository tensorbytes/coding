package stack

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestRemoveKdigits(t *testing.T) {
	num := "1432219"
	k := 3
	res := removeKdigits(num, k)
	assert.Equal(t, "1219", res)
}
