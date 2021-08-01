class UnionFind(object):
    def __init__(self, grid):
        m, n = len(grid), len(grid[0])

        self.count = 0

        # 二维数组用一维 数组表示,  举个例子,  将 0-9 作为第一行,10-19作为第二行
        self.parent = [-1] * m * n

        # 初始化, 将自己的值设置为自己表示自己的 老大 是自己
        for i in range(m):
            for j in range(n):
                if grid[i][j] == '1':
                    self.parent[i * n + j] = i * n + j
                    self.count += 1

    def find(self, i):
        if self.parent[i] != i:
            self.parent[i] = self.find(self.parent[i])
        return self.parent[i]

    def union(self, x, y):
        rootx = self.find(x)
        rooty = self.find(y)
        if rootx != rooty:
            self.parent[rooty] = rootx
            self.count -= 1


class Solution(object):
    def numIslands(self, grid: list) -> int:
        if not grid or not grid[0]:
            return 0

        uf = UnionFind(grid)
        # x , y  0,1 表示 下
        directions = [(0, 1), (0, -1), (-1, 0), (1, 0)]
        m, n = len(grid), len(grid[0])

        for i in range(m):
            for j in range(n):
                if grid[i][j] == "0":
                    continue
                for d in directions:
                    nr, nc = i + d[0], j + d[1]
                    if nr >= 0 and nc >= 0 and nr < m and nc < n and grid[nr][nc] == "1":
                        uf.union(i * n + j, nr * n + nc)

        return uf.count
