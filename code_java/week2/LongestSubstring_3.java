package week2;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 9/7/2021
 */
public class LongestSubstring_3 {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            if(s== null || s.length()==0){
                return 0;
            }

            int count=0,left = 0,rs=0;
            Set<Character> set = new HashSet<>();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(set.add(c)){
                    count += 1;
                    if(count>rs){
                        rs = count;
                    }
                }else{
                    char r;
                    while((r = s.charAt(left)) != c){
                        left += 1;
                        count -=1;
                        set.remove(r);
                    }
                    left += 1;
                }
            }
            return rs;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String mes = "aabaab!bb";
        System.out.println(s.lengthOfLongestSubstring(mes));
    }


}
