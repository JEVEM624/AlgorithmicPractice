package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author JEVEM624
 * @Date 2019/4/7
 * @Version 1.0
 */
public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        new RemoveOutermostParentheses().removeOuterParentheses("(()())(())(()(()))");
    }
    public String removeOuterParentheses(String S) {
        Queue<Character> stack=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        int sum=0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i)=='('){
                stack.add(S.charAt(i));
                sum++;
            }else {
                stack.add(S.charAt(i));
                sum--;
            }
            if (sum==0){
                ((LinkedList<Character>) stack).pollFirst();
                int si=stack.size();
                for (int j = 0; j < si-1; j++) {
                    sb.append(stack.poll());
                }
                stack.clear();
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}
