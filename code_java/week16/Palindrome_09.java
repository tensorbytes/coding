package week16;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 11/24/2021
 */
public class Palindrome_09 {

    static class Solution {
        public boolean isPalindrome(int x) {



            int left=0;
            int right;
            String tmp = x+"";
            int max =  tmp.length();

            right = max/2;
            while( left < right){
                if(tmp.charAt(left) != tmp.charAt(max-left-1)){
                    return false;
                }
                left += 1;
            }
            return true;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(12321));
    }
}
