class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        n = len(nums)
        tmp = [0]*n
        dup = 0
        # 先进行桶排序
        for i in range(n):
            ind = nums[i]-1
            value = nums[i]
            if tmp[ind] != 0:
                dup = value
            else:
                tmp[ind]= value

        # 找出为0的
        for i in range(n):
            if tmp[i] == 0:
                return [dup,i+1]