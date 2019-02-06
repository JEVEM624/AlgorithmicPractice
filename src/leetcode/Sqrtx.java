package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/6
 * @Version 1.0
 */
public class Sqrtx {
    public static void main(String[] args) {
        System.out.println(new Sqrtx().mySqrt(2147395599));
    }
    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        long low = 0;
        long height = x;
        long middle = x / 2;
        while(low<=height) {
            if((middle*middle<x&&(middle+1)*(middle+1)>x)||middle*middle==x){
                return (int)middle;
            }
            if (middle * middle > x) {
                height=middle-1;
                middle=(low+height)/2;
            }else{
                low=middle+1;
                middle=(low+height)/2;
            }
        }
        return 0;
    }
}
