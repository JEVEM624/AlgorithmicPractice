package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/4/19
 * @Version 1.0
 */
public class MaximumSwap {
    public static void main(String[] args) {
        new MaximumSwap().maximumSwap(2736);
    }
    public int maximumSwap(int num) {
        StringBuffer s=new StringBuffer(String.valueOf(num));
        for (int i = 0; i < s.length()-1; i++) {
            int index1=i;
            int index2=-1;
            char max=s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(j)>=max){
                    index2=j;
                    max=s.charAt(j);
                }
            }
            if (index2==-1||s.charAt(index1)==s.charAt(index2)){
                continue;
            }else {
                char temp=s.charAt(index1);
                s.setCharAt(index1, s.charAt(index2));
                s.setCharAt(index2, temp);
                return Integer.valueOf(s.toString());
            }
        }
        return num;
    }
}
