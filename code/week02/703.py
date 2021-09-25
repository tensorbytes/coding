# 设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。 
# 
#  请实现 KthLargest 类： 
# 
#  
#  KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。 
#  int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素。 
#  
# 
#  
# 
#  示例： 
# 
#  
# 输入：
# ["KthLargest", "add", "add", "add", "add", "add"]
# [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
# 输出：
# [null, 4, 5, 5, 8, 8]
# 
# 解释：
# KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
# kthLargest.add(3);   // return 4
# kthLargest.add(5);   // return 5
# kthLargest.add(10);  // return 5
# kthLargest.add(9);   // return 8
# kthLargest.add(4);   // return 8
#  
# 
#  
# 提示：
# 
#  
#  1 <= k <= 104 
#  0 <= nums.length <= 104 
#  -104 <= nums[i] <= 104 
#  -104 <= val <= 104 
#  最多调用 add 方法 104 次 
#  题目数据保证，在查找第 k 大元素时，数组中至少有 k 个元素 
#  
#  Related Topics 堆 设计 
#  👍 262 👎 0


# leetcode submit region begin(Prohibit modification and deletion)
class Heap:

    def __init__(self):
        self.count = 0
        self.heap = [-1]

    # 入堆
    def push(self,a):
        self.count += 1
        self.heap.append(a)
        pos = self.count

        # 自下向上
        while True:
            parent = int(pos/2)
            # 此处交换的条件是 如果是 子>父 则是大顶堆, 子 < 父 则是 小顶堆
            if parent > 0 and self.heap[pos] < self.heap[parent]:
                self.swap(pos,parent)
                pos = parent
            else:
                break

    # 出堆
    # 出堆
    def pop(self)  -> int:
        if self.count == 0:
            return None
        result = self.heap[1]
        self.heap[1] = self.heap[self.count]
        self.heap.pop()
        self.count -= 1

        pos = 1
        # 自上向下
        while True:
            tmp = pos
            if pos*2 <= self.count and self.heap[tmp] > self.heap[pos*2]:
                tmp = pos*2
            if pos*2 + 1 <= self.count and self.heap[tmp] > self.heap[pos*2 + 1]:
                tmp = pos*2 + 1
            if tmp == pos:
                break
            self.swap(tmp,pos)
            pos = tmp

        return result


    def swap(self,a,b):
        tmp = self.heap[a]
        self.heap[a] = self.heap[b]
        self.heap[b] = tmp



class KthLargest:

    def __init__(self, k: int, nums: list[int]):
        self.k = k
        self.heap = Heap()
        for i in nums:
            self.heap.push(i)
            if self.heap.count > k:
                self.heap.pop()

    def add(self, val: int) -> int:
        self.heap.push(val)
        if self.heap.count > self.k:
            self.heap.pop()
        return self.heap.heap[1]


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)
# leetcode submit region end(Prohibit modification and deletion)
if __name__ == '__main__':

    #   import heapq   python 自带的堆实现
    obj = KthLargest(k=3, nums=[4, 5, 8, 2])

    for i in [3, 5, 10, 9, 4]:
        obj.add(i)
        print(str(i) + "," + str(obj.heap.heap))
