package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/3/13
 * @Version 1.0
 */
public class GenerateParentheses {
    public static void main(String[] args) {

    }
    public List<String> generateParenthesis(int n) {
        List<String>result =new ArrayList<>();
        helper(result, "", 0, 0, 2*n);
        return result;
    }
    public void helper(List<String>result,String s,int leftNum,int rightNum,int max){
        if (leftNum+rightNum==max){
            result.add(s);
            return;
        }
        if (leftNum>=rightNum&&leftNum<max/2){
            helper(result, s+"(", leftNum+1, rightNum, max);
        }
        if (rightNum<leftNum&&rightNum<max/2){
            helper(result, s+")", leftNum, rightNum+1, max);
        }

    }
}
