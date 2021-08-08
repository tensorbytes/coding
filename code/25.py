

class Solution:
    def searchInsert(self, nums: list, target: int) -> int:
        left,right = 0,len(nums)-1
        while left <= right:
            mid = round((left + right) /2)
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                right = mid - 1
            else:
                left = mid + 1
        return mid if nums[mid] > target else mid + 1