# 摩尔投票法
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
        if not nums:
            return

        if len(nums) == 1:
            return nums[0]
        votes = 0
        for i in nums:
            if votes == 0:
                x =i
            if i == x:
                votes +=1
            else:
                votes -=1
        return x