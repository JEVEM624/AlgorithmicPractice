package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/12
 * @Version 1.0
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while (i<j){
            char temp=s[i];
            s[i++]=s[j];
            s[j--]=temp;
        }
    }
}
