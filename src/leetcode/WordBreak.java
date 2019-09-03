package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/8/18
 * @Version 1.0
 */
public class WordBreak {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("a");
        list.add("code");
        new WordBreak().wordBreak("a", list);
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String>set=new HashSet<>();
        set.addAll(wordDict);
        boolean[]dp=new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String tmp=s.substring(i,j+1);
                if (set.contains(tmp)){
                    if (j-tmp.length()<0||dp[j-tmp.length()]==true){
                        dp[j]=true;
                    }
                }
            }
        }
        return dp[s.length()-1];
    }
}
