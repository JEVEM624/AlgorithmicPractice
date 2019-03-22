package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/22
 * @Version 1.0
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        long begin = 0;
        long end = n;
        long mid = n / 2;
        while (true) {
            if (isBadVersion((int)(mid))) {
                if (!isBadVersion((int)mid- 1) ) {
                    return (int)mid;
                }
                end = mid - 1;
                mid = (end + begin) / 2;
            } else {
                begin = mid + 1;
                mid = (end + begin) / 2;
            }
        }
    }
}
