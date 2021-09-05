class Solution:
    def trailingZeroes(self, n: int) -> int:
        ans = 0
        while n >= 5:
            ans = ans + n//5
            n=n//5
        return ans