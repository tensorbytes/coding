class Solution:
    def climbStairs(self, n: int) -> int:
        p, q, r = 0, 0, 1
        for i in range(n):
            p = q
            q = r
            r = p + q
        return r

