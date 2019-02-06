package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/6
 * @Version 1.0
 */
public class Powxn {
    public static void main(String[] args) {
        System.out.println(new Powxn().myPow(2.00000, 10));
    }

    public double myPow(double x, int n) {
        boolean flag = false;
        double result = 1;
        long time = n;

        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1 / x;
        }
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            flag = true;
            time = Math.abs(time);
        }
        while (time > 0) {
            long i = 2;
            double temp = x;
            while (i < time) {
                temp = temp * temp;
                i = 2 * i;

            }
            if (time == 1) {
                result = result * x;
                break;
            }
            result = result * temp;
            time = time - (int) (i / 2);
        }

        if (flag) {
            return 1 / result;
        } else {
            return result;
        }
    }
}
