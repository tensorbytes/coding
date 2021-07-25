class Solution:
    def hammingWeight(self, n: int) -> int:
        res =0
        while n>0:
            res += 1
            n = n & n-1
        return res


    def hammingWeight(self, n: int) -> int:
        res =0
        mask = 1
        for i in range(32):
            if n & mask:
                res += 1
            mask = mask << 1
        return res