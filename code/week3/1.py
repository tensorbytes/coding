# coding=utf-8
# ----------------
# author: weiyu
# create_time : 5/1/2021
# description : 

# https://leetcode-cn.com/problems/two-sum/

class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        tmp_map = {}
        for index,value in enumerate(nums):
            other_index = tmp_map.get(target-value,None)
            if other_index is not None:
                return [other_index,index]
            else:
                tmp_map[value]=index



