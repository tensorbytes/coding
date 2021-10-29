package week11;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 10/28/2021
 *
 *
 *
 * 70. 爬楼梯
 * https://leetcode-cn.com/problems/climbing-stairs/
 */
public class Climbing_70 {

    /*static class Solution {
        public int climbStairs(int n) {
            return go(n,1)+go(n,2);

        }

        public int go(int n,int cur){
            if(cur==n){
                return 1;
            }else if(cur > n){
                return 0;
            }
            return go(n,1+cur)+go(n,2+cur);
        }

    }*/
    static class Solution {
        public int climbStairs(int n) {

            if(n<2){
                return n;
            }

            int[] dp = new int[n+1];
            dp[1]= 1;
            dp[2]= 2;
            for (int i = 3; i <= n; i++) {
                dp[i]=dp[i-1]+dp[i-2];
            }
            return dp[n];
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.climbStairs(5));
    }

}
