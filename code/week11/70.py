"""
回溯算法,会提示超时因为时间复杂度为2的N次方

class Solution:
    def climbStairs(self, n: int) -> int:
        return self.go(n,0)


    def go(self,n,cur) -> int:
        if cur == n:
            return 1

        if cur > n:
            return 0

        return self.go(n,cur + 1) + self.go(n,cur + 2)
"""

"""
从起点递推到终点
"""
class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 1:
            return n
        res = 2
        pre = 1
        for _ in range(3,n+1):
            res,pre = res + pre,res
        return res


