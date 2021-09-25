# coding=utf-8
# ----------------
# author: weiyu
# create_time : 5/2/2021
# description : 

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:

    def __init__(self):
        self.pre = None

    def isValidBST(self, root: TreeNode) -> bool:

        if root is None:
            return True

        if self.isValidBST(root.left) == False:
            return False

        if self.pre is not None and root.val <= self.pre.val:
            return False

        self.pre = root
        return self.isValidBST(root.right)
