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
            return internalValid(root,null,0);
        }
        boolean internalValid(TreeNode root,TreeNode lastRoot,int leftOrRight) {

            if(root ==null){
                return true;
            }

            if(!internalValid(root.left,root,0)){
                return false;
            }

            if(lastRoot!=null){
                if(leftOrRight==0){
                    return root.val < lastRoot.val;
                }else{
                    return root.val > lastRoot.val;
                }
            }

            if(!internalValid(root.right,root,1)){
                return false;
            }
            return true;
        }
    }




    public static void main(String[] args) {

    }

}
