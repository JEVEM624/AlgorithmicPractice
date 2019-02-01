package nowcoder;

/**
 * @Author JEVEM624
 * @Date 2019/2/1
 * @Version 1.0
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        System.out.println(new ReplaceSpace().replaceSpace(new StringBuffer("We Are Happy.")));
    }
    public String replaceSpace(StringBuffer str) {
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                sum++;
            }
        }
        int flag=str.length()+2*sum-1;
        char[]result =new char[flag+1];
        for (int i = str.length()-1; i >=0 ; i--) {
            if(str.charAt(i)==' '){
                result[flag]='0';
                result[flag-1]='2';
                result[flag-2]='%';
                flag=flag-3;
            }else {
                result[flag]=str.charAt(i);
                flag--;
            }
        }
        return String.valueOf(result);
    }
}
