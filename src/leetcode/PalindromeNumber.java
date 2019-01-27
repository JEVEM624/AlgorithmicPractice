package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/1/27
 * @Version 1.0
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(121));
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=0;
        int k=x;
        while (k>0){
            num=num*10+k%10;
            k=k/10;
        }
        if(x==num){
            return true;
        }
        return false;
    }
}
