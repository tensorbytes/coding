package week3;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 9/18/2021
 */
public class VaildBST_98 {


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    static class Solution {

        public boolean isValidBST(TreeNode root) {
            return internalValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
        }
        boolean internalValid(TreeNode currentNode,long min,long max) {

            if(currentNode ==null){
                return true;
            }

            if(!internalValid(currentNode.left,min,currentNode.val)){
                return false;
            }

            if(currentNode.val <= min || currentNode.val>= max){
                return false;
            }

            if(!internalValid(currentNode.right,currentNode.val,max)){
                return false;
            }
            return true;
        }
    }




    public static void main(String[] args) {

    }

}
