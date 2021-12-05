package week17;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/12/5 0005
 */
public class SingleNumber_136 {

    static class Solution {
        public int singleNumber(int[] nums) {
            int res = nums[0];
            for (int i = 1; i < nums.length; i++) {
                res = res ^ nums[i];
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        int res = s.singleNumber(new int[]{-1,3,4,3,4});
        System.out.println(res);
    }


}
