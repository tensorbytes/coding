class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        s1,s2 = len(s), len(t)

        dp = [ [0 for _ in range(s1 + 1)] for _ in range(s2 +1)]

        for i in range(1,s2+1):
            for j in range(1,s1+1):
                if t[i-1] == s[j-1]:
                    dp[i][j] = dp[i-1][j-1]+1
                else:
                    dp[i][j] = dp[i-1][j]

        return dp[s2][s1] == s1



if __name__ == '__main__':
    obj = Solution()
    print(obj.isSubsequence("abc","ahbgdc"))