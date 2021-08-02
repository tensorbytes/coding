# coding=utf-8
# ----------------
# author: weiyu
# create_time : 5/29/2021
# description : 
# 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
#
#
#
#  示例 1：
#
#
# 输入：n = 3
# 输出：["((()))","(()())","(())()","()(())","()()()"]
#
#
#  示例 2：
#
#
# 输入：n = 1
# 输出：["()"]
#
#
#
#
#  提示：
#
#
#  1 <= n <= 8
#
#  Related Topics 字符串 回溯算法
#  👍 1804 👎 0


# leetcode submit region begin(Prohibit modification and deletion)
class Solution:
    def generateParenthesis(self, n: int) -> list:
        self.res = []
        self._gen(0,0,n,"")
        return self.res

    def _gen(self,left,right,n,one):
        if left == n and right == n:
            self.res.append(one)
            return

        if left < n:
            self._gen(left+1,right,n,one + "(")

        if left > right and right < n:
            self._gen(left,right+1,n,one + ")")




# leetcode submit region end(Prohibit modification and deletion)