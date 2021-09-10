package week2;//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 104 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 
// 👍 2341 👎 0
public class ValidParentheses_20 {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isValid("{}{}[]"));
    }

}
class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%2==1){
            return false;
        }
        Map<Character,Character> map=new HashMap(){
            {
                put(')','(');
                put('}','{');
                put(']','[');
            }
        };
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                if(stack.isEmpty()||stack.peek()!=map.get(ch)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
