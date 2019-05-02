package nowcoder;

import java.util.Scanner;

/**
 * @Author JEVEM624
 * @Date 2019/4/29
 * @Version 1.0
 */
public class IndependentXiaoyi {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int x=scanner.nextInt();
        int f=scanner.nextInt();
        int d=scanner.nextInt();
        int p=scanner.nextInt();
        int days=0;
        days=Math.min(f, d/x);
        d=d-days*x;
        days=days+(d/(x+p));
        System.out.println(days);
    }
}
