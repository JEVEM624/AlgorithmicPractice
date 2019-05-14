package leetcode;

import java.util.Stack;

/**
 * @Author JEVEM624
 * @Date 2019/5/13
 * @Version 1.0
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int a=0,b=0;
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+":
                    a=Integer.valueOf(stack.pop());
                    b=Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(a+b));
                    break;
                case "-":
                    a=Integer.valueOf(stack.pop());
                    b=Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(b-a));
                    break;
                case "*":
                    a=Integer.valueOf(stack.pop());
                    b=Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(a*b));
                    break;
                case "/":
                    a=Integer.valueOf(stack.pop());
                    b=Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(b/a));
                    break;
                default:
                    stack.push(tokens[i]);
            }
        }
        return Integer.valueOf(stack.pop());
    }
}
