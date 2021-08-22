# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:

        if root is None or (root.left is None and root.right is None):
            return True

        # elif not (root.left and root.right):
        #    return False
        # 此处注释掉这里是因为 root.right 如果是None, 下面的代码也是可以运行的
        # stack = [root.left,None]

        stack = [root.left,root.right]

        while stack:

            left = stack.pop(0)
            right = stack.pop(0)

            if left is None and right is None:
                continue

            if left is None or right is None:
                return False

            if left.val != right.val:
                return False

            stack.append(left.left)
            stack.append(right.right)

            stack.append(left.right)
            stack.append(right.left)

        return True