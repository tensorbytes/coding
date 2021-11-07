package week11;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/11/6 0006
 */
public class NQueens_52 {

    static class Solution {

        int result;

        public int totalNQueens(int n) {
            dfs(0, 0, 0, 0, n);
            return result;
        }

        public void dfs(int lv, int col, int pie, int na, int max) {

            if (lv == max) {
                result += 1;
                return;
            }

            /**
             * 这个语句是为了取出该层 还剩下哪些位置可以用
             *
             * col 很容易理解
             * pie、 na 你只要看成是 当前层的 对应的位置 即可
             * 递归到下一层的时候， 只需要 左移 或者右移一位即可
             *
             *
             * 举个例子 例如  N= 4
             * 第一层的第2位放了一个皇后   对应 pie 为  0100, na 为 0100
             * 现在递归到第二层，  第二层 对应的pie 左移一位 得到 1000 ，na右移一位得到 0010
             * 对应的  pie | na之后  得到 1010 表示 第二层的 第一个以及第三个是可以被上面的皇后攻击到的
             *
             *
             *
             */
            int bits = ~(col | pie | na) & ((1 << max) - 1);
            while (bits > 0) {
                /**
                 *  bits & -bits 是为了取出最低位的 1
                 *  原理是  负数在计算机中存储形式是 原码的反码+ 1
                 *
                 *  以2为例
                 *  原码 =     010
                 *  反码 =     101
                 *  反码+1 =   110
                 *  原码&(反码+1) = 正数 &负数 = 010
                 *
                 *
                 */
                int p = bits & -bits;
                dfs(lv + 1, col | p, (pie | p) << 1, (na | p) >> 1, max);
                bits = bits & bits - 1;
            }
        }





    }

}
