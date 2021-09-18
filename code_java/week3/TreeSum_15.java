package week3;

import java.util.*;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 9/18/2021
 */

public class TreeSum_15 {

   static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {

            Arrays.sort(nums);
            HashSet<String> set = new HashSet<>();
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> tmp = null;
            for(int i=0;i<nums.length-2;i++){
                /*if(nums[i]==nums[i+1]){
                    continue;
                }*/
                HashMap<Integer,Integer> map = new HashMap<>();
                Integer x = null;
                for(int j=i+1;j<nums.length;j++){
                    //先看是否存在 x = -nums[j] 如果存在则表示满足条件，加入结果
                    x = map.getOrDefault(-nums[j],null);
                    if(x!=null){
                        //add
                        if(set.add(""+ nums[i] +nums[j]+ nums[x])){
                            tmp =  new ArrayList<>(3);
                            tmp.add(nums[i]);
                            tmp.add(nums[x]);
                            tmp.add(nums[j]);
                            result.add(tmp);
                        }
                    }else{
                        //如果没有则加入map中
                        map.put(nums[i]+nums[j],j);
                    }
                }
            }
            return result;
        }
    }


    public static void main(String[] args) {
        Solution s =new Solution();
        int[] test = new int[]{-1,0,1,2,-1,-4};
        System.out.println(s.threeSum(test));
    }
}
