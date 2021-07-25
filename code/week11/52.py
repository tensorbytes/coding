class Solution:
    def totalNQueens(self, n: int) -> int:
        if n < 1:
            return []
        self.count = 0
        self.dfs(n, 0, 0, 0, 0)
        return self.count

    def dfs(self,n,row,cols,pie,na):
        if row >= n:
            self.count += 1
            return
        # 这里 1 向左移n位后-1 就能得到10000 -1 借位结果为  二进制为 1111(假设n=4)
        bits = (~( cols | pie | na)) & ((1<<n)-1)

        # 直到所有的1都被消除掉
        while bits:
            p = bits & -bits  # 取得最低位的1 , 负数在计算机中以补码形式存储, 补码 = 反码 + 1
            self.dfs(n,row + 1,cols | p , (pie | p) << 1 , (na | p) >> 1)
            bits = bits & (bits -1)  # 消去最低位的1

