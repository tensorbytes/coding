package week17;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/12/5 0005
 */
public class LongestPrefix_14 {

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String res = strs[0];
            for (int i = 1; i < strs.length; i++) {
                int j;
                for (j = 0; j < res.length() && j<strs[i].length(); j++) {
                    if(res.charAt(j)!=strs[i].charAt(j)){
                        break;
                    }
                }
                // substring 是左闭右开的
                res = res.substring(0,j);
                if(res.equals("")){
                    return res;
                }
            }

            return res;
        }
    }


}
