package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/4/15
 * @Version 1.0
 */
public class MinimumAddtoMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        int num=0;
        int status=0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i)=='('){
                status++;
            }else {
                status--;
            }
            if (status<0){
                num++;
                status=0;
            }
        }
        return num+status;
    }
}
