package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/3
 * @Version 1.0
 */
public class CheckIfWordIsValidAfterSubstitutions {
    public static void main(String[] args) {
        System.out.println(new CheckIfWordIsValidAfterSubstitutions().isValid("aabcbc"));
    }

    public boolean isValid(String S) {
        if (S.length() == 0) {
            return true;
        }
        if (S.length() % 3 != 0) {
            return false;
        }
        String[] temp = S.split("abc");
        if (temp.length == 1) {
            return false;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < temp.length; i++) {
            stringBuffer.append(temp[i]);

        }
        ;
        return isValid(stringBuffer.toString());
    }
}
