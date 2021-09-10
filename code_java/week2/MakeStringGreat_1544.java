package week2;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 9/10/2021
 */
public class MakeStringGreat_1544 {

    static class Solution {
        public String makeGood(String s) {
            if(s.trim().equals("")) {
                return "";
            }
            StringBuilder sb =new StringBuilder(s.length());
            char tmp,lastChar;
            for(int i=0;i<s.length();i++){
                tmp = s.charAt(i);
                if(sb.length()>0){
                    lastChar = sb.charAt(sb.length()-1);
                    if(lastChar != tmp && Character.toUpperCase(tmp) == Character.toUpperCase(lastChar)){
                        sb.delete(sb.length()-1,sb.length());
                    }else{
                        sb.append(tmp);
                    }
                }else{
                    sb.append(tmp);
                }
            }
            return sb.toString();
        }
    }


    public static void main(String[] args) {

        String s = "leEeetcode";
        Solution obj = new Solution();
        //assert obj.makeGood(s).equals("leetcode");
        System.out.println(obj.makeGood(s));
    }

}
