package stack

func asteroidCollision(asteroids []int) []int {

	collision := true
	n := len(asteroids)

	for collision {
		collision = false

		idx := 0
		for idx < n {
			if asteroids[idx] == 0 && idx < n {
				idx++
			}

			next := idx + 1
			for next < n {
				if asteroids[next] != 0 {
					break
				}
				next++
			}

			if next >= n {
				break
			}

			asteroid1 := asteroids[idx]
			asteroid2 := asteroids[next]

			if asteroid1 > 0 && asteroid2 < 0 {
				asteroid2 = -asteroid2

				if asteroid1 == asteroid2 {
					asteroids[idx] = 0
					asteroids[next] = 0
					idx = next
				} else {
					if asteroid1 > asteroid2 {
						asteroids[next] = 0
					} else {
						asteroids[idx] = 0
						idx = next
					}
				}

				collision = true
			} else {
				idx = next
			}
		}
	}

	ans := []int{}
	for _, asteroid := range asteroids {
		if asteroid != 0 {
			ans = append(ans, asteroid)
		}
	}

	return ans
}
