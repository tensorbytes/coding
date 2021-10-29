package week10;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 10/28/2021
 *
 *
 * 2 的幂
 * https://leetcode-cn.com/problems/power-of-two/
 */
public class PowOfTwo_231 {

    static class Solution {
        public boolean isPowerOfTwo(int n) {
            // n  > 0 是因为 2的幂次 不可能小于0
            return n > 0 && (n&(n-1))==0;
        }
    }

}
