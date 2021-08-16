class Solution:
    def longestCommonPrefix(self, strs: list) -> str:
        nums = len(strs)

        if nums == 1:
            return strs[0]

        # 找出循环终止条件, 最短字符串长度
        max_index = len(strs[0])
        for i in range(1,nums):
            size = len(strs[i])
            if max_index > size:
                max_index = size

        # 纵向比较
        index = 0
        res= ""
        while index < max_index:
            cur = strs[0][index]
            for i in range(1,nums):
                if cur != strs[i][index]:
                    return res
            res = res + cur
            index += 1
        return res
