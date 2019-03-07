package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/7
 * @Version 1.0
 */
public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        int[]sum=new int[26];
        int[]index=new int[26];
        for (int i = 0; i < s.length(); i++) {
            sum[s.charAt(i)-'a']++;
            index[s.charAt(i)-'a']=i;
        }
        int min=s.length()+1;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i]==1){
                min=Math.min(min, index[i]);
            }
        }
        if (min==){
            return -1;
        }else {
            return min;
        }
    }
}
