class Solution:
    def countBits(self, n: int) -> list[int]:
        res = [0 for _ in range(n+1)]
        for i in range(1,n+1):
            res[i] = res[ i&(i-1)] +1
        return res