# coding=utf-8
# ----------------
# author: weiyu
# create_time : 9/10/2021
# description :

"""
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
 

示例 1：

输入：s = "()"
输出：true
示例 2：

输入：s = "()[]{}"
输出：true
示例 3：

输入：s = "(]"
输出：false
示例 4：

输入：s = "([)]"
输出：false
示例 5：

输入：s = "{[]}"
输出：true
 

提示：

1 <= s.length <= 104
s 仅由括号 '()[]{}' 组成

"""
class Solution:
    def isValid(self, s: str) -> bool:

        if len(s)%2!=0:
            return False

        stack = list()
        keys = set(["(","[","{"])
        dmap = {
            "(":")",
            "[":"]",
            "{":"}"
        }

        stack.append(s[0])
        for i in range(1,len(s)):
            if s[i] in keys:
                stack.append(s[i])
                continue

            elif stack:
                last_char = stack[-1]
                tmp = dmap.get(last_char,"None")
                if tmp != s[i]:
                    return False
                else:
                    stack.pop(-1)
            else:
                return False
        if stack:
            return False
        else:
            return True



if __name__ == '__main__':
    obj = Solution()
    print(obj.isValid("(){}}{"))