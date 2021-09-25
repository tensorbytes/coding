package week4;


public class PowXN_50 {


    static class Solution {
        public double myPow(double x, int n) {
            if(x==0) return 0;
            double res = 1.0d;
            long b = n;
            if(b<0){
                x= 1/x;
                b = -b;
            }

            while(b>0){
                if((b&1)==1){
                    res *= x;
                }
                x*=x;
                b >>= 1;
            }

            return res;
        }

    }


    static class Solution2 {
        public double myPow(double x, int n) {
            if (x == 0) {
                return 0;
            }

            if (n==0){
                return 1;
            }

            if (n < 0) {
                return 1 / myPow(x, -n);
            } else {
                if ((n & 1) == 1) {
                    return x * myPow(x, n - 1);
                } else {
                    return myPow(x * x, n / 2);
                }
            }
        }

    }


    public static void main(String[] args) {

    }

}
