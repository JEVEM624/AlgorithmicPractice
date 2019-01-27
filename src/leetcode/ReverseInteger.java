package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/1/27
 * @Version 1.0
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(1534236469));
    }
    public int reverse(int x) {
        long num=0;
        boolean flag=false;
        if(x<0){
            flag=true;
            x=Math.abs(x);
        }

        while (x>0){
            num=num*10+x%10;
            x=x/10;
        }
        if(flag){
            num=0-num;
        }
        if(num>2147483647||num<-2147483648){
            return 0;
        }
        return (int)num;
    }
}
