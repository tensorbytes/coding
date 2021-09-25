package week3;

import java.util.HashMap;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 9/18/2021
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.getOrDefault(nums[i],-1) > -1){
                result[0]=map.get(nums[i]);
                result[1]=i;
                return result;
            }else{
                map.put(target-nums[i],i);
            }
        }
        return null;
    }
}


public class TwoSum_1 {


    public static void main(String[] args) {

    }

}
