package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/17
 * @Version 1.0
 */
public class ComplementofBase10Integer {
    public int bitwiseComplement(int N) {
        String temp=Integer.toBinaryString(N);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i)=='1'){
                sb.append('0');
            }else {
                sb.append('1');
            }
        }
        return Integer.valueOf(sb.toString(), 2);
    }
}
