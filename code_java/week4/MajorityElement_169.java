package week4;

public class MajorityElement_169 {

    static class Solution {
        public int majorityElement(int[] nums) {
            int res = nums[0];
            int count = 1;
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=res){
                    count -= 1;
                    if(count==0) {
                        count = 1;
                        res = nums[i];
                    }
                }else{
                    count +=1;
                }
            }
            return res;
        }
    }


    public static void main(String[] args) {
        Solution s= new Solution();
        int res = s.majorityElement(new int[]{
                2,2,1,1,1,2,2});
        System.out.println(res) ;
    }

}
