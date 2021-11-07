package week12;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/11/6 0006
 */
public class Mismatch_645 {

    static class Solution {
        public int[] findErrorNums(int[] nums) {

            int x = 0;
            int count = 2;
            int error = 0;

            for (int i = 0; i < nums.length; i++) {
                int p =1<<nums[i];
                if((x&p) ==0){
                    x = x | p;
                }else{
                    error = nums[i];
                }
            }

            x = x>>3; //因为最小数字为2
            while((x&1)==1){
                x=x>>1;
                count+=1;
            }
            return new int[]{error,count+1};
        }
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] res= s.findErrorNums(new int[]{
                1,2,2,4});
        for (int r:res
             ) {
            System.out.println(r);
        }


        System.out.println((3>>2)&1);
    }
}
