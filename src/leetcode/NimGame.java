package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/18
 * @Version 1.0
 */
public class NimGame {
    public boolean canWinNim(int n) {
        boolean[]len=new boolean[4];
        len[1]=len[2]=len[3]=true;
        len[0]=false;
        return len[n%4];
    }
}
