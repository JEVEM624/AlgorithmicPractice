package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/3/3
 * @Version 1.0
 */
public class FindCommonCharacters {
    public static void main(String[] args) {
        System.out.println(new FindCommonCharacters().commonChars(new String[]{"bbddabab","cbcddbdd","bbcadcab","dabcacad","cddcacbc","ccbdbcba","cbddaccc","accdcdbb"}));
    }
    public List<String> commonChars(String[] A) {
        int[]sum=new int[26];
        for (int i = 0; i < 26; i++) {
            sum[i]=101;
        }
        for (int i = 0; i < A.length; i++) {
            int[]time2=new int[26];
            for (int j = 0; j < A[i].length(); j++) {
                time2[A[i].charAt(j)-'a']++;
            }
            for (int j = 0; j < 26; j++) {
                sum[j]=Math.min(sum[j],time2[j]);
            }
        }
        List<String> result=new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < sum[i]; j++) {
                result.add(String.valueOf((char)(i+'a')));
            }
        }
        return result;
    }
}
