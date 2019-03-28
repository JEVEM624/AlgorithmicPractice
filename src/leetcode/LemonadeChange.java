package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/28
 * @Version 1.0
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int[]status=new int[2];
        for (int i = 0; i < bills.length; i++) {
            if (bills[i]==5){
                status[0]++;
            }else if (bills[i]==10){
                status[0]--;
                status[1]++;
            }else {
                if (status[1]>0&&status[0]>0){
                    status[0]--;
                    status[1]--;
                }else {
                    status[0]=status[0]-3;
                }
            }
            if (status[0]<0||status[1]<0){
                return false;
            }
        }
        return true;
    }
}
