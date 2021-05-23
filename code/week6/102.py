# Definition for a binary tree node.

import collections
class TreeNode:
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right
class Solution:
    def levelOrder(self, root: TreeNode) -> list:
        if not root:
            return []


        queue = collections.deque()
        res = []
        queue.append(root)


        while queue:

            size = len(queue)
            cur_level = []

            for _ in range(size):
                cur_node = queue.popleft()
                cur_level.append(cur_node.val)
                if cur_node.left:
                    queue.append(cur_node.left)
                if cur_node.right:
                    queue.append(cur_node.right)

            res.append(cur_level)
        return res