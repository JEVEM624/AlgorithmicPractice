package leetcode;

import java.util.Stack;

/**
 * @Author JEVEM624
 * @Date 2019/2/27
 * @Version 1.0
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("(]"));
    }

    public boolean isValid(String s) {
        Stack<Character> status = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                status.push(s.charAt(i));
            } else if (!status.isEmpty()) {
                char p = status.pop();
                char v = s.charAt(i);
                if (v == ')' && p != '(') {
                    return false;
                } else if (v == '}' && p != '{') {
                    return false;

                } else if (v == ']' && p != '[') {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (!status.isEmpty()) {
            return false;
        }
        return true;
    }
}
