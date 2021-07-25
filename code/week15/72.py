class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        w1 = len(word1)
        w2 = len(word2)

        dp = [ [0 for i in range(w2+1)] for j in range(w1+1) ]

        for i in range(1,w2+1):
            dp[0][i] = dp[0][i-1] + 1

        # 初始状态对应 单词2为空的情况, 单词1需要向单词靠拢需要删除自己
        for i in range(1,w1+1):
            dp[i][0] = i

        for i in range(1,w1+1):
            for j in range(1,w2+1):
                if word1[i-1] == word2[j-1]:
                    dp[i][j] = dp[i-1][j-1]
                else:
                    # 此处 分别对应 插入, 替换，删除
                    # 此处难以理解的地方在于 为什么 可以用到dp[i-1][j] 、 dp[i][j-1]
                    # 原因是不理解 dp[i][j]的状态定义是什么 ， dp[i][j]的意义是 第一个单词前 i 个字符 变成 第二个单词 前j个字
                    # 符的最小步骤是多少次 。
                    # 那么 dp[i-1][j]代表的是第一个单词的前i-1个字符与 第二单词的 j-1个字符相同了 现在就差 第二单词的第j个字符，
                    # 那么只要插入1个或者替换1 个就能变成 第i 个字符等于 第j 个字符了
                    # 因此 dp[i][j] 可以等于 dp[i-1][j] 。
                    dp[i][j] = min(dp[i-1][j], dp[i][j-1],dp[i-1][j-1]) + 1
        return dp[w1][w2]
if __name__ == '__main__':
    obj = Solution()
    print(obj.minDistance("horse","ros"))