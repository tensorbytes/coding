package DoublePointer

import (
	"fmt"
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestCountGoodSubstrings(t *testing.T) {
	res := countGoodSubstrings("xyzzaz")
	fmt.Println(res)
	assert.Equal(t, 1, res)
	assert.Equal(t, 4, countGoodSubstrings("aababcabc"))
}
