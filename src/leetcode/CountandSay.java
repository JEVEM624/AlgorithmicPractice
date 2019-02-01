package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/1
 * @Version 1.0
 */
public class CountandSay {
    public static void main(String[] args) {
        System.out.println(new CountandSay().countAndSay(30));
    }
    public String countAndSay(int n) {
        int i=1;
        String result="1";
        while(i<n){
            result=function(result);
            i++;
        }
        return result;
    }
    public static String function(String s){
        StringBuffer sb=new StringBuffer();
        int sum=1;
        char flag=s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==flag){
                sum++;
            }else{
                sb.append(sum);
                sb.append(s.charAt(i-1));
                sum=1;
                flag=s.charAt(i);
            }
        }
        sb.append(sum);
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }
}
