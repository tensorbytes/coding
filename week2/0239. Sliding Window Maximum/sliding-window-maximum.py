from collections import deque
class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        que = deque()
        result = []
        for i in range(len(nums)):
            while que and nums[que[-1]] <= nums[i]:
                que.pop()
            que.append(i)
            if que and que[0] <i -k +1:
                que.popleft()
            if i +1 >= k:
                result.append(nums[que[0]])
        return result