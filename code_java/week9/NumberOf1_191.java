package week9;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 10/18/2021
 *
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 *
 */
public class NumberOf1_191 {

    static class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int mask = 1;
            int res  = 0;
            while( n != 0){
                res += n&1;
                n= n >>> 1;
            }
            return res;
        }
    }

    public static void main(String[] args) {

    }

}
