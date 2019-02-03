package leetcode;

import com.sun.org.apache.xpath.internal.operations.Plus;

/**
 * @Author JEVEM624
 * @Date 2019/2/3
 * @Version 1.0
 */
public class PlusOne {
    public static void main(String[] args) {
        System.out.println(new PlusOne().plusOne(new int[]{9,9}));
    }
    public int[] plusOne(int[] digits) {
        boolean flag=false;
        for (int i = digits.length-1; i >=0 ; i--) {
            digits[i]++;
            if(digits[i]==10){
                digits[i]=0;
                if(i==0){
                    flag=true;
                }
            }else {
                break;
            }
        }
        if(flag){
            int[]temp =new int[digits.length+1];
            temp[0]=1;
            return temp;
        }
        return digits;
    }
}
