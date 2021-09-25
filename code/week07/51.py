# coding=utf-8
# ----------------
# author: weiyu
# create_time : 5/28/2021
# description : 


# n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
#
#  给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
#
#
#
#  每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
#
#
#
#  示例 1：
#
#
# 输入：n = 4
# 输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
# 解释：如上图所示，4 皇后问题存在两个不同的解法。
#
#
#  示例 2：
#
#
# 输入：n = 1
# 输出：[["Q"]]
#
#
#
#
#  提示：
#
#
#  1 <= n <= 9
#  皇后彼此不能相互攻击，也就是说：任何两个皇后都不能处于同一条横行、纵行或斜线上。
#
#
#
#  Related Topics 回溯算法
#  👍 882 👎 0


# leetcode submit region begin(Prohibit modification and deletion)
class Solution:
    def solveNQueens(self, n: int) -> list:

        if n < 1:
            return []

        # 用于判断是否冲突
        self.cols = set()
        self.left = set()
        self.right = set()

        # 结果集
        self.res = []
        self.dfs(n, 0, [])
        return self.res

    def dfs(self, n, row, state):

        if row == n:
            self.res.append(self._gen_result(n,state))
            return

        for i in range(n):
            if i in self.cols or (row - i) in self.left or (row + i) in self.right:
                continue

            self.cols.add(i)
            self.left.add(row-i)
            self.right.add(row + i)

            state.append(i)
            self.dfs(n,row + 1,state)
            state.remove(i)

            self.cols.remove(i)
            self.left.remove(row-i)
            self.right.remove(row + i)

    def _gen_result(self,n,state):
        tmp = []
        for pos in state:
            one = ""
            for j in range(n):
                if j == pos:
                    one += "Q"
                else:
                    one += "."
            tmp.append(one)
        return tmp


if __name__ == '__main__':
    obj = Solution()
    print(obj.solveNQueens(4))