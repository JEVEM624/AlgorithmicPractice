package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/19
 * @Version 1.0
 */
public class HIndex {
    public static void main(String[] args) {
        new HIndex().hIndex(new int[]{3, 0, 6, 1, 5});
    }

    public int hIndex(int[] citations) {
        if (citations.length == 0) {
            return 0;
        }
        int right = 0;
        int left = 0;
        int mid = 0;
        for (int i = 0; i < citations.length; i++) {
            right = right + citations[i];
        }
        mid = right / citations.length;
        int result = 0;
        while (left <= right) {
            int i = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= mid) {
                    i++;
                }
            }
            if (i >= mid) {
                result = Math.max(result, mid);
            }
            if (i >= mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        return result;
    }
}
