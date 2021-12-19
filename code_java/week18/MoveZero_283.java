package week18;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/12/20 0020
 */
public class MoveZero_283 {

    static class Solution {
        public void moveZeroes(int[] nums) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]!=0){
                    if(i>j){
                        nums[j] = nums[i];
                        nums[i]=0;
                    }
                    j+=1;
                }
            }
        }
    }

}
