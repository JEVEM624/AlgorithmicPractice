package leetcode;

import java.math.BigInteger;

/**
 * @Author JEVEM624
 * @Date 2019/3/24
 * @Version 1.0
 */
public class BinaryStringWithSubstringsRepresenting1ToN {
    public static void main(String[] args) {
        new BinaryStringWithSubstringsRepresenting1ToN().queryString("0110", 4);
    }
    public boolean queryString(String S, int N) {
        for (int i = 1; i <= N; i++) {
            String l=Integer.toBinaryString(i);
            String[]temp=S.split(l);
            if (temp.length!=0&&temp[0].length()==S.length()){
                return false;
            }
        }
        return true;
    }
}
