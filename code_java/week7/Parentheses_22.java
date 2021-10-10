package week7;

import java.util.LinkedList;
import java.util.List;

public class Parentheses_22 {

    static class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> fs = new LinkedList<>();
            gen(0,0,n,"",fs);
            return fs;
        }

        public void gen(int left,int right,int n,String res,List<String> ls){
            if(left==n && right == n){
                ls.add(res);
                return;
            }

            if(left < n){
                gen(left+1,right,n,res + "(",ls);
            }
            if(left > right && right < n){
                gen(left,right + 1,n,res+")",ls);
            }

        }
    }

    public static void main(String[] args) {

    }


}
