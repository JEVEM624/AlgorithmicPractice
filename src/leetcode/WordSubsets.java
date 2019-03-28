package leetcode;

import java.util.*;

/**
 * @Author JEVEM624
 * @Date 2019/3/28
 * @Version 1.0
 */
public class WordSubsets {
    public static void main(String[] args) {
        new WordSubsets().wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}
        , new String[]{"e","o"});
    }
    public List<String> wordSubsets(String[] A, String[] B) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < B.length; i++) {
            int[] temp = new int[26];
            for (int j = 0; j < B[i].length(); j++) {
                temp[B[i].charAt(j) - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                if (temp[j] != 0) {
                    if (map.containsKey(j)) {
                        map.put(j, Math.max(temp[j], map.get(j)));
                    }else {
                        map.put(j, temp[j]);
                    }
                }
            }
        }
        int[][] status = new int[A.length][26];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                status[i][A[i].charAt(j) - 'a']++;
            }
        }
        Set set = map.entrySet();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < status.length; i++) {
            boolean flag = true;
            Iterator<Map.Entry<Integer, Integer>> iterator = set.iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                if (status[i][entry.getKey()] < entry.getValue()) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(A[i]);
            }
        }
        return result;
    }
}
