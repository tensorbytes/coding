package week10;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 10/28/2021
 *
 *  338. 比特位计数
 * https://leetcode-cn.com/problems/counting-bits/
 *
 */
public class CountingBits_338 {


    static class Solution {
        public int[] countBits(int n) {
            int[] result = new int[n+1];
            result[0]=0;
            for (int i = 1; i <= n; i++) {
                int count = 0;
                int x = i;
                while(x !=0){
                    x = x&(x-1);
                    count += 1;
                }
                result[i]=count;
            }
            return result;
        }
    }


}
