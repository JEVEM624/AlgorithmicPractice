package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/20
 * @Version 1.0
 */
public class ShiftingLetters {
    public static void main(String[] args) {
        new ShiftingLetters().shiftingLetters("bad", new int[]{10,20,30});
    }
    public String shiftingLetters(String S, int[] shifts) {
        StringBuilder stringBuilder=new StringBuilder();
        long sum=0;
        for (int i = S.length()-1; i >=0; i--) {
            sum=sum+shifts[i];
            stringBuilder.append( (char)((S.charAt(i)-97+sum)%26+97));
        }
        return stringBuilder.reverse().toString();
    }
}
