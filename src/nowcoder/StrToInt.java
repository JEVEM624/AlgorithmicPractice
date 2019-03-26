package nowcoder;

/**
 * @Author JEVEM624
 * @Date 2019/3/25
 * @Version 1.0
 */
public class StrToInt {
    public static void main(String[] args) {
        System.out.println(new StrToInt().StrToInt("-123"));

    }
    public int StrToInt(String str) {
        if(str.length()<=0){
            return 0;
        }
        if (str.charAt(0)=='+'){
            return helper(true,str, 1);
        }else if (str.charAt(0)=='-'){
            return helper(false,str, 1);
        }else {
            return helper(true,str,0);
        }
    }
    public static int helper(boolean flag,String str,int begin){
        long result=0;
        for (int i = begin; i < str.length(); i++) {
            if (str.charAt(i)-'0'>9||str.charAt(i)-'0'<0){
                return 0;
            }
            result=result*10+str.charAt(i)-'0';
        }
        if (result>0x7fffffff&&flag){
            return 0;
        }else if(result>0X000080000000L&&!flag){
            return 0;
        }
        return flag?(int)result:-(int)result;
    }
}
