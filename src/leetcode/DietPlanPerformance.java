package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/9/1
 * @Version 1.0
 */
public class DietPlanPerformance {
    public static void main(String[] args) {
        new DietPlanPerformance().dietPlanPerformance(new int[]{1, 2, 3, 4, 5}, 1, 3, 3);
    }

    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int res = 0;
        int[] a = new int[calories.length];
        a[0] = calories[0];
        for (int i = 1; i < calories.length; i++) {
            a[i] = calories[i] + a[i - 1];
        }

        if (a[k - 1] > upper) {
            res++;
        } else if (a[k - 1] < lower) {
            res--;
        }

        for (int i = k; i < a.length; i++) {
            int sum = a[i] - a[i - k];
            if (sum > upper) {
                res++;
            } else if (sum < lower) {
                res--;
            }
        }
        return res;
    }
}
