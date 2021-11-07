package week12;

import java.util.List;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/11/6 0006
 */
public class Triangle_120 {


    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {


            /**
             * +1 是类似于哨兵一样的处理
             */
            int[] result = new int[triangle.size()+1];


            /**
             * 动态规划的两个关键步骤
             * 1、状态的定义
             * 2、公式的推导, 从后往前推状态会更容易计算
             *
             */
            for (int i = triangle.size()-1; i >=0; i--) {
                List<Integer> tmp = triangle.get(i);
                for (int j = 0; j < tmp.size(); j++) {
                    result[j] = tmp.get(j) + Math.min(result[j],result[j+1]);
                }
            }
            return result[0];
        }
    }

}
