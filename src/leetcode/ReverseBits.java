package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/4/2
 * @Version 1.0
 */
public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(new ReverseBits().reverseBits(-3));

    }
    public int reverseBits(int n) {
        int result=0;
        int sum=32;
        while(sum>=1){
            result=result+(n&1);
            result=result<<1;
            n=n>>>1;
            sum--;
        }
        result=result+n;
        return result;
    }
}
