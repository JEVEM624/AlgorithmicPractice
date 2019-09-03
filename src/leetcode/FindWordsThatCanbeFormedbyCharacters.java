package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/19
 * @Version 1.0
 */
public class FindWordsThatCanbeFormedbyCharacters {

    public static void main(String[] args) {
        new FindWordsThatCanbeFormedbyCharacters().countCharacters(new String[]{"cat","bt","hat","tree"}, "atach");
    }
    public int countCharacters(String[] words, String chars) {
        int[]c=new int[26];
        for (int i = 0; i < chars.length(); i++) {
            c[chars.charAt(i)-'a']++;
        }
        int sum=0;
        for (int i = 0; i < words.length; i++) {
            int[]tmp=new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                tmp[words[i].charAt(j)-'a']++;
            }
            boolean flag=false;
            for (int j = 0; j < 26; j++) {
                if (tmp[j]>c[j]){
                    flag=true;
                    break;
                }
            }
            if (flag){
                continue;
            }
            sum=sum+words[i].length();
        }
        return sum;
    }

}
