package leetcode;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/9/3
 * @Version 1.0
 */
public class CanMakePalindromefromSubstring {
    public static void main(String[] args) {
        new CanMakePalindromefromSubstring().canMakePaliQueries("xebyvmjqbmbs", new int[][]{{1, 10, 3}});
    }

    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int[][] sta = new int[s.length() + 2][26];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++) {
                sta[i + 1][j] = sta[i][j];
            }
            sta[i + 1][s.charAt(i) - 'a']++;
        }
        List<Boolean> res = new ArrayList<>();
        for (int[] a : queries) {
            int l = a[0];
            int r = a[1];
            int k = a[2];
            int sum = 0;
            for (int i = 0; i < 26; i++) {
                int p = sta[r + 1][i] - sta[l][i];
                if (p % 2 != 0) {
                    sum = sum + p % 2;
                }
            }
            sum = sum / 2;
            if (sum <= k) {
                res.add(true);
            } else {
                res.add(false);
            }

        }
        return res;
    }
}
