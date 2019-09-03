package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/31
 * @Version 1.0
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] res=new int[num+1];
        for (int i = 1; i <= num; i=i*2) {
            res[i]=1;
        }
        for (int i = 3; i <= num; i++) {
            if (res[i]!=0){
                continue;
            }
            if (i%2==0){
                res[i] = res[i>>1];
            }else {
                res[i]=res[i-1]+1;
            }
        }
        return res;
    }
}
