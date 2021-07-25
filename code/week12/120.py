
# 120. 三角形最小路径和


class Solution:
    def minimumTotal(self, triangle: list) -> int:
        """
        :type triangle: List[List[int]]
        :rtype: int
        """
        n= len(triangle)
        dp = [0 ] * (n+1)
        for i in range(n-1,-1,-1):
            for j in range(0,i+1):
                dp[j] = triangle[i][j] + min(dp[j],dp[j+1])
        return dp[0]



if __name__ == '__main__':
    a = [[2],[3,4],[6,5,7],[4,1,8,3]]

    n = len(a)
    for i in range(n-1,-1,-1):
        print(i)



    print('---------------')

    obj = Solution()
    print(obj.minimumTotal(a))