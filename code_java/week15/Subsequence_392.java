package week15;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/11/20 0020
 */
public class Subsequence_392 {


    /**
     * dp的做法在时间复杂度以及空间复杂度上都没有优势
     * 只是该题是求字符串编辑距离的简化版,用DP来练手而已。
     *
     * 双指针的时间复杂度为 （M+N）
     *
     * 编辑距离的题目  I 与 J 表示  前I个字符与前J个字符
     * 设置DP[i][j]的值为 前i 与 前j的最大公共串长度
     *
     * 当i与j 走完的时候,  dp[i][j] = s1.length()  s1是s2的子串
     *
     */
    static class Solution {
        public boolean isSubsequence(String s, String t) {
           int[][] dp = new int[s.length()+1][t.length()+1];
            for (int i = 1; i <= s.length(); i++) {
                for (int j = 1; j <= t.length(); j++) {
                    if(s.charAt(i-1)==t.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            return dp[s.length()][t.length()] == s.length();
        }
    }

}
