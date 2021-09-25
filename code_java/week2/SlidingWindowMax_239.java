package week2;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 9/8/2021
 */
public class SlidingWindowMax_239 {

    static class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            LinkedList<Integer> list = new LinkedList<>();
            int size = nums.length;
            int[] res = new int[ size-k + 1];
            for(int i=0;i<size;i++){
                if(i>=k && list.getFirst() <= i-k ){
                    list.removeFirst();
                }
                while(!list.isEmpty() && nums[list.getLast()]<nums[i]){
                    list.removeLast();
                }
                list.addLast(i);
                if(i >= k-1){
                    res[i-k+1] = nums[list.getFirst()];
                }

            }
            return res;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] test = new int[]{
                1,3,1,2,0,5};
        int k = 3;
        int[] res = s.maxSlidingWindow(test,k);
        for(int i:res){
            System.out.println(i);
        }
    }


}
