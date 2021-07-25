class Node(object):
    def __init__(self, ch):
        self.cur_char = ch
        self.isEnd = False
        self.next = {}

    def get(self, ch):
        return self.next.get(ch, None)

    def put(self, ch, node):
        self.next[ch] = node


class DictTree(object):
    def __init__(self):
        self.root = Node(" ")

    def insert(self, word):
        node = self.root
        for c in word:
            tmp = node.get(c)
            if tmp is None:
                tmp = Node(c)
                node.put(c, tmp)
            node = tmp
        node.isEnd = True

    #def getNode(self, ch):
    #    return self.root.get(ch)


class Solution:
    def findWords(self, board: list, words: list) -> list:

        if words is None or board is None or len(words) == 0:
            return []

        rows = len(board)
        if rows == 0:
            return []
        cols = len(board[0])

        if cols == 0:
            return []

        # 构建字典树
        dictTree = DictTree()
        for w in words:
            dictTree.insert(w)

        self.res = set()
        # 搜索单词
        for i in range(rows):
            for j in range(cols):
                dup_set = set()
                # 字典树检查是否存在该字符
                self.dfs(i, j, rows, cols,board, dup_set, dictTree.root, "")

        return [i for i in self.res]

    def dfs(self, x, y, row, col, board, dup_set, last_node, result):

        # 终止条件
        if x < 0 or x == row or y < 0 or y == col or (x, y) in dup_set:
            return

        # 取出当前字符,利用字典树判断是否有后续

        cur_ch = board[x][y]
        tmp_node = last_node.get(cur_ch)
        # 将当前字符加上
        result += cur_ch

        # 如果字典树有返回值表示还能继续匹配
        if tmp_node is None:
            return
        else:

            if tmp_node.isEnd:
                self.res.add(result)

        # 分别往4个方向的前进
        dup_set.add((x, y))

        # 上
        self.dfs(x, y - 1, row, col, board, dup_set, tmp_node, result)
        # 右
        self.dfs(x + 1, y, row, col, board, dup_set, tmp_node, result)
        # 下
        self.dfs(x, y + 1, row, col, board, dup_set, tmp_node, result)
        # 左
        self.dfs(x - 1, y, row, col, board, dup_set, tmp_node, result)
        dup_set.remove((x, y))



if __name__ == '__main__':

    # test1
    #board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]]
    #words = ["oath","pea","eat","rain"]

    # test2
    board = [["o", "a", "a", "n"],
             ["e", "t", "a", "e"],
             ["i", "h", "k", "r"],
             ["i", "f", "l", "v"]]
    words = ["oath","pea","eat","rain","hklf", "hf"]
    obj = Solution()
    print(obj.findWords(board,words))