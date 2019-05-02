package nowcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author JEVEM624
 * @Date 2019/4/29
 * @Version 1.0
 */
public class Equaldifferenceseries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scanner.nextInt();
        }
        Arrays.sort(nums);
        int k=nums[1]-nums[0];
        for (int i = 2; i < n; i++) {
            if (nums[i]-nums[i-1]!=k){
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
}
