package week13;

import java.util.List;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 11/8/2021
 */
public class MaxSubArray_53 {

    static class Solution {
        public int maxSubArray(int[] nums) {
            int res = nums[0];
            int cur = nums[0];
            for (int i = 1; i < nums.length; i++) {
                int c = nums[i];
                cur = Math.max(cur+c,c);
                res = Math.max(res,cur);
            }
            return res;
        }
    }


}
