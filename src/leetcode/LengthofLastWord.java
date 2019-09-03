package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/9/2
 * @Version 1.0
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int res=0;
        int index=s.length()-1;
        while (index>0){
            if (s.charAt(index)==' '){
                index--;
                continue;
            }else {
                break;
            }
        }
        for (int i = index; i >=0 ; i--) {
            if (s.charAt(i)!=' '){
                res++;
            }else {
                break;
            }
        }
        return res;
    }
}
