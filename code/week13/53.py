
class Solution:
    def maxSubArray(self, nums: list) -> int:
        if len(nums) == 1:
            return nums[0]
        # 重点是找出递推的关系
        # 递推往往是当前节点 的结果值 是由上一个节点 再结合当前节点 得到的
        # 递进的关系 可以 从后往前, 从前往后.
        # 题目是求最大的子串.   必须是连续的. 如果把当前节点当做子串最后的节点
        # 可能的情况就能固定下来.有两种可能, 一种是与上一个节点组合成最大子串, 自己就是最大子串
        # 就可以得到 dp[i] = max(dp[i-1] + i, i )
        # 遍历所有保留最大即可
        rs = nums[0]
        cur = nums[0]
        for i in range(1,len(nums)):
            cur = max(cur + nums[i],nums[i])
            rs = max(rs,cur)
        return rs
