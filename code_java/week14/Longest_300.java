package week14;

import java.util.Arrays;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 11/9/2021
 */
public class Longest_300 {

    static class Solution {
        public int lengthOfLIS(int[] nums) {

            if(nums.length < 2){
                return 1;
            }

            int[] dp = new int[nums.length];
            int res=1;
            Arrays.fill(dp,1);
            for (int i = 1; i < nums.length; i++) {
                for (int j = 0; j < i; j++) {
                    if(nums[j]<nums[i]){
                        //dp[i] +=  1;  //  error ,
                        dp[i] = Math.max(dp[i],dp[j]+1);
                    }
                }
                res = Math.max(dp[i],res);
            }
            return res;
        }
    }



}
