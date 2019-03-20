package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/18
 * @Version 1.0
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if(num<1){
            return false;
        }
        while (num>1){
            if (num%2==0){
                num=num/2;
                continue;
            }
            if (num%3==0){
                num=num/3;
                continue;
            }
            if (num%5==0){
                num=num/5;
                continue;
            }
            return false;
        }
        return true;
    }
}
