package week3;

import java.util.Collection;
import java.util.HashMap;

public class ValidAnagram_242 {


    static class Solution {
        public boolean isAnagram(String s, String t) {
            HashMap<Character,Integer> map = new HashMap<>(26);

            int count =0;
            for(int i=0;i<s.length();i++){
                count = map.getOrDefault(s.charAt(i),0);
                count ++;
                map.put(s.charAt(i),count);
            }

            for(int i=0;i<t.length();i++){
                count = map.getOrDefault(t.charAt(i),0);
                count --;
                map.put(t.charAt(i),count);
            }

            Collection<Integer> list = map.values();
            for(int i:list){
                if(i!=0){
                    return false;
                }
            }
            return true;
        }
    }


    static class Solution2 {
        public boolean isAnagram(String s, String t) {
            int[] chars = new int[26];
            char c;
            for(int i=0;i<s.length();i++){
                c=s.charAt(i);
                chars[c-'a']++;
            }
            for(int i=0;i<t.length();i++){
                c=t.charAt(i);
                chars[c-'a']--;
            }
            for(int i:chars){
                if(i!=0){
                    return false;
                }
            }
            return true;

        }
    }


    public static void main(String[] args) {

        Solution s=new Solution();
        System.out.println(s.isAnagram("anagram","nagaram"));


        Solution s2=new Solution();
        System.out.println(s2.isAnagram("anagra","nagaram"));
    }

}
