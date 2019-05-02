package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/4/25
 * @Version 1.0
 */
public class StringtoInteger {
    public int myAtoi(String str) {
        str=str.trim();
        if (str.length()<=0){
            return 0;
        }
        long num=0;
        int i=0;
        char f=str.charAt(0);
        boolean flag=false;
        if (f=='-'){
            flag=true;
            i++;
        }
        if (f=='+'){
            i++;
        }
        int len=0;
        for(;i<str.length()&&len<11;i++){
            char c=str.charAt(i);
            int k=c-'0';
            if (k>9||k<0){
                break;
            }
            num=num*10+k;
            if(num!=0){
                len++;
            }
        }
        if (flag){
            num=0-num;
        }
        if (num>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(num<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)num;
    }
}
