package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author JEVEM624
 * @Date 2019/8/22
 * @Version 1.0
 */
public class SatisfiabilityofEqualityEquations {
    public static void main(String[] args) {
        new SatisfiabilityofEqualityEquations().equationsPossible(new String[]{"b!=f","c!=e","f==f","d==f","b==f","a==f"});
    }
    public boolean equationsPossible(String[] equations) {
        int[]sta=new int[26];
        Queue<String> queue=new LinkedList<>();

        for (int i = 0; i < 26; i++) {
            sta[i]=i;
        }
        for (int i = 0; i < equations.length; i++) {
            if (equations[i].charAt(1)=='!'){
                queue.add(equations[i]);
            }else {
                int a=equations[i].charAt(0)-'a';
                int b=equations[i].charAt(3)-'a';
                int min=Math.min(sta[a],sta[b]);
                int max=Math.max(sta[a],sta[b]);
                for (int j = 0; j < 26; j++) {
                    if (sta[j]==a||sta[j]==b||sta[j]==max){
                        sta[j]=min;
                    }
                }
            }
        }
        while (!queue.isEmpty()){
            String i=queue.poll();
            int a=i.charAt(0)-'a';
            int b=i.charAt(3)-'a';
            if (a==b||sta[a]==sta[b]){
                return false;
            }
        }
        return true;
    }
}
