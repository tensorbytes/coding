package week7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Nqueens_51 {

    static class Solution {
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> result = new ArrayList<>();
            Set<Integer> col = new HashSet<>();
            Set<Integer> pie = new HashSet<>();
            Set<Integer> na = new HashSet<>();

            gen(result,col,pie,na,0,n,"");
            return result;
        }

        public void gen(List<List<String>> res,Set<Integer> col,Set<Integer> pie,Set<Integer> na,int rowIndex,int queueSize,String pos){

            if(rowIndex == queueSize){
                res.add(parse(pos,queueSize));
                return;
            }
            // 原是0 取反后为 1 与 1进行与操作表示 没有冲突
            for (int i = 0; i < queueSize; i++) {
                if(!col.contains(i) && !pie.contains(rowIndex+i) && !na.contains(rowIndex-i)){
                    col.add(i);
                    pie.add(rowIndex+i);
                    na.add(rowIndex-i);
                    gen(res,col, pie,na ,rowIndex+1,queueSize,pos+","+i);
                    col.remove(i);
                    pie.remove(rowIndex+i);
                    na.remove(rowIndex-i);
                }
            }
        }

        public List<String> parse(String pos,int n){
            int i;
            ArrayList<String> tmp = new ArrayList<>(n);
            pos = pos.substring(1);
            for(String index : pos.split(",")){
                i = Integer.parseInt(index);
                String a= "";
                for (int j = 0; j < n; j++) {
                    if(j!=i){
                        a += ".";
                    }else{
                        a += "Q";
                    }
                }
                tmp.add(a);
            }
            return tmp;
        }

    }

    public static void main(String[] args) {

        int x= 0;
        System.out.println(x>>-1);

        Solution s = new Solution();
        List<List<String>> res = s.solveNQueens(4);
        System.out.println(res.size());
    }
}
