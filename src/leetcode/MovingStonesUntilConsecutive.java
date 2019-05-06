package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/5/5
 * @Version 1.0
 */
public class MovingStonesUntilConsecutive {
    public static void main(String[] args) {
        new MovingStonesUntilConsecutive().numMovesStones(4, 3, 2);
    }

    public int[] numMovesStones(int a, int b, int c) {
        if (a < b) {
            if (b < c) {
                return helper(a, b, c);
            } else {
                if (a < c) {
                    return helper(a, c, b);
                } else {
                    return helper(c, a, b);
                }
            }
        } else {
            if (a < c) {
                return helper(b, a, c);
            } else {
                if (b < c) {
                    return helper(b, c, a);
                }else {
                    return helper(c, b, a);
                }
            }
        }
    }

    public int[] helper(int x, int y, int z) {
        int[] res = new int[2];
        if (y - x == 1 && z - y == 1) {
            res[0] = 0;
            res[1] = 0;
            return res;
        }
        if (y - x == 1) {
            res[0] = 1;
            res[1] = z - y - 1;
            return res;
        }
        if (z - y == 1) {
            res[0] = 1;
            res[1] = y - x - 1;
            return res;
        }
        if (y - x == 2) {
            res[0] = 1;
            res[1] = z - x - 2;
            return res;
        }
        if (z - y == 2) {
            res[0] = 1;
            res[1] = z - x - 2;
            return res;
        }
        res[0] = 2;
        res[1] = z - x - 2;
        return res;
    }
}
