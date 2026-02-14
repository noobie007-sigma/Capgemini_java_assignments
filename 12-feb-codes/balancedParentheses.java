//https://www.hackerrank.com/challenges/balanced-brackets/problem?isFullScreen=true

import java.util.*;

public class balancedParentheses {
    public static String isBalanced(String s) {
    // Write your code here
        
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < s.length()) {
            char curr = s.charAt(i);
            if(curr == '(' || curr == '[' || curr == '{') {
                st.push(curr);
            }
            else {
                if(st.isEmpty()) return "NO";
                char last = st.pop();
                if((curr == ')' && last != '(') || (curr == ']' && last != '[') || (curr == '}' && last != '{')) return "NO";
            }
            i++;
        }
        return st.isEmpty() ? "YES" : "NO";
        
    }
}
