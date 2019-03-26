package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author JEVEM624
 * @Date 2019/3/26
 * @Version 1.0
 */
public class NumbersWithSameConsecutiveDifferences {
    public static void main(String[] args) {
        new NumbersWithSameConsecutiveDifferences().numsSameConsecDiff(1, 0);
    }

    public int[] numsSameConsecDiff(int N, int K) {
        HashSet<Integer> set = new HashSet<>();
        if (N == 1) {
            set.add(0);
        }

        for (int i = 1; i <= 9; i++) {
            helper(i, 1, set, N, K, i);
        }
        int[] result = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        int flag = 0;
        while (iterator.hasNext()) {
            result[flag++] = iterator.next();
        }
        return result;
    }

    public void helper(int num, int len, HashSet<Integer> result, int N, int K, int last) {
        if (len == N) {
            result.add(num);
            return;
        }
        int max = last + K;
        int min = last - K;
        if (max <= 9) {
            helper(num * 10 + max, len + 1, result, N, K, max);
        }
        if (min >= 0) {
            helper(num * 10 + min, len + 1, result, N, K, min);
        }
        return;
    }
}
