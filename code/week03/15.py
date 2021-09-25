# coding=utf-8
# ----------------
# author: weiyu
# create_time : 5/2/2021
# description : 


class Solution:
    def threeSum(self, nums: list) -> list:
        if len(nums) < 3:
            return []
        # 排序是为了去重
        nums.sort()
        res = []

        for i,v in enumerate(nums[:-2]):
            # 重复的跳过
            if i >= 1 and v == nums[i-1]:
                continue

            # 同样是为了去重
            d = {}
            for x in nums[i+1:]:
                # 这里用-x是 另外两个数 + x = 0,另两个数之和 = -x
                if -x not in d:
                    # 这里应该是将x+v存储起来
                    d[x+v] = 1
                else:
                    # 第二个数是 需要用 -x 减去v得到
                    res.append((v,-x-v,x))
        return res

if __name__ == '__main__':
    s = Solution()
    test = [-1,0,1,2,-1,-4]
    res = s.threeSum(test)
    print(res)