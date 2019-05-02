package nowcoder;

import java.util.Scanner;

/**
 * @Author JEVEM624
 * @Date 2019/4/29
 * @Version 1.0
 */
public class Longest01substring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int[]sta=new int[s.length()];
        sta[0]=1;
        int max=1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(i-1)){
                sta[i]=sta[i-1]+1;
                max=Math.max(max, sta[i]);
            }else {
                sta[i]=1;
            }
        }
        System.out.println(max);
    }
}
