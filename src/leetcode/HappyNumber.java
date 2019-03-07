package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author JEVEM624
 * @Date 2019/3/7
 * @Version 1.0
 */
public class HappyNumber {
    public static void main(String[] args) {
        new HappyNumber().isHappy(2);
    }

    public boolean isHappy(int n) {
        HashSet<Integer> map = new HashSet<>();
        int sum = 0;
        while (true) {
            if (map.contains(n)) {
                return false;
            } else {
                map.add(n);
            }
            while (n > 0) {
                int base = n % 10;
                sum = sum + base * base;
                n = n / 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
            sum = 0;
        }
    }
}
