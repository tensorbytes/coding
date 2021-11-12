package week14;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 11/12/2021
 */
public class Coin_322 {

    static class Solution {
        public int coinChange(int[] coins, int amount) {

            int[] dp= new int[amount+1];
            for (int i = 1; i < dp.length; i++) {
                dp[i]=Integer.MAX_VALUE;
                for (int j = 0; j < coins.length; j++) {
                    int pos = i-coins[j];
                    if(pos>=0 && dp[pos]!=Integer.MAX_VALUE){
                        dp[i]= Math.min(dp[i],dp[pos]+1);
                    }
                }
            }
            return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
        }

        public static void main(String[] args) {
            int[] data = new int[]{2};
            Solution s =new Solution();
            System.out.println(s.coinChange(data,3));

        }
    }


}
