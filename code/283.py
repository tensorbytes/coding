class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None:
            return None

        size = len(nums)
        if size < 2:
            return None

        j = 0
        for i in range(size):
            if nums[i] != 0:
                if i > j:
                    nums[j], nums[i] = nums[i], nums[j]
                j += 1