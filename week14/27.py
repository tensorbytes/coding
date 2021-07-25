class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        left = 0
        for v in  nums:
            if v != val:
                nums[left] = v
                left+=1
        return left