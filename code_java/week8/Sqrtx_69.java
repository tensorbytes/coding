package week8;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 10/15/2021
 */
public class Sqrtx_69 {

    static class Solution {
        public int mySqrt(int x) {
            if(x ==0 || x == 1){
                return x;
            }
            int left =1 ;
            int right=x;
            int mid = 0,res =0;
            while (left <= right){
                mid = (left + right )/2;
                if(mid == x/mid){
                    return mid;
                }else if (mid > x/mid ){
                    right = mid - 1;
                    //res = mid;
                }else {
                    left =  mid  + 1;
                    res = mid;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.mySqrt(6));
    }

}



