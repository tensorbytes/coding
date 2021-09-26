package week6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 9/26/2021
 */
public class LevelTreeVistor_102 {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if(root==null){
                return res;
            }
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            List<Integer> lv;
            TreeNode tmp;
            while(!queue.isEmpty()){
                lv = new LinkedList<>();
                int size = queue.size();
                for(int i=0;i<size;i++){
                    tmp = queue.removeFirst();
                    lv.add(tmp.val);
                    if(tmp.left!=null){
                        queue.add(tmp.left);
                    }
                    if(tmp.right!=null){
                        queue.add(tmp.right);
                    }
                }
                res.add(lv);
            }
            return res;
        }
    }

}
