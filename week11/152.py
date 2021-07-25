class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        maxF, minF, ans = nums[0], nums[0], nums[0]
        for i in range(1, len(nums)):
            mx, mn = maxF, minF
            maxF = max(mx * nums[i], max(nums[i], mn * nums[i]))
            minF = min(mn * nums[i], min(nums[i], mx * nums[i]))
            ans = max(maxF, ans)
        return ans


    def max(x, y ):
        if x > y:
            return x
        return y

    def min(x, y):
        if x <y:
            return x
        return y
