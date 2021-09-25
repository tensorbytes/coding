package week3;

public class CommonPath_235 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if ((root.val - p.val) * (root.val - q.val) <= 0){
                return root;
            }
            if(root.val < p.val){
                return lowestCommonAncestor( root.right,  p,  q);
            }else{
                return lowestCommonAncestor( root.left,  p,  q);
            }
        }
    }
}
