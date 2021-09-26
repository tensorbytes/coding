package week6;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 9/26/2021
 */
public class MaxTree_104 {
       static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    static class Solution {
        public int maxDepth(TreeNode root) {
            return dfs(root);
        }

        public int dfs(TreeNode root){
            if(root==null){
                return 0;
            }
            return 1+Math.max(dfs(root.left),dfs(root.right));
        }
    }

    public static void main(String[] args) {

    }


}
