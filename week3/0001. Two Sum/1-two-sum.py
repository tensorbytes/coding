class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashmap = dict()
        for index, num in enumerate(nums):
            anthoer_num = target - num
            if anthoer_num in hashmap:
                return [hashmap[anthoer_num], index]
            hashmap[num] = index
        return None