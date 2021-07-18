class Solution:
    def lengthOfLIS(self, nums:list) -> int:
        length = len(nums)
        if length == 1 :
            return 1

        res = 1
        # 初始化状态
        dp = [1 for _ in range(length)]

        for i in range(1,length):
            for j in range(0,i):
                if nums[j] < nums[i]:
                    dp[i] = max(dp[i],dp[j] + 1)

            res= max(dp[i],res)

        return res


