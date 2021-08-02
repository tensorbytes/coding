# coding=utf-8
# ----------------
# author: weiyu
# create_time : 5/2/2021
# description : 


class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        # 如果根节点和p,q的差相乘是正数，说明这两个差值要么都是正数要么都是负数，也就是说
        # 他们肯定都位于根节点的同一侧，就继续往下找
        while (root.val - p.val) * (root.val - q.val) > 0:
            # P点值小于root的值说明p,q都在左子树
            if p.val < root.val:
                root = root.left
            else:
                root = root.right
        return root
