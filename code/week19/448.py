class Solution:
    def findDisappearedNumbers(self, nums: list) -> list:
        result = []
        size = len(nums)

        for i in nums:
            # print(i)
            index = (i - 1) % size
            nums[index] += size

        for i in range(size):
            # print( "{},{}".format(i,nums[i]))
            # 此处需要注意 是小于等于
            if nums[i] <= size:
                result.append(i+1)
            else:
                # 复原原数组
                tmp = nums[i] % size
                if tmp == 0:
                    nums[i] -= (int(nums[i] / size) - 1) * size
                else:
                    nums[i] = tmp
        return result

if __name__ == '__main__':
    obj = Solution()
    a = [4, 3, 2, 7, 8, 2, 3, 1]
    print(obj.findDisappearedNumbers(a))
    print(a)
