package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/9/2
 * @Version 1.0
 */
public class PushDominoes {
    public static void main(String[] args) {
        new PushDominoes().pushDominoes("RR.L");
    }
    public String pushDominoes(String dominoes) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        int last = 0;
        while (i < dominoes.length()) {
            if (dominoes.charAt(i) == '.') {
                i++;
                continue;
            } else if (dominoes.charAt(i) == 'L') {
                while (last<=i){
                    sb.append('L');
                    last++;
                }
                i++;
            }else {
                while (last<i){
                    sb.append('.');
                    last++;
                }
                int j=i+1;
                while (j<dominoes.length()){
                    if (dominoes.charAt(j)=='L'){
                        break;
                    }
                    if (dominoes.charAt(j)=='R'){
                        i=j;
                        while (last<i){
                            sb.append('R');
                            last++;
                        }
                    }
                    j++;
                }
                if (j==dominoes.length()){
                    while (i<dominoes.length()){
                        sb.append('R');
                        i++;
                        last++;
                    }
                }else {
                    int len=j-i;
                    boolean flag=false;
                    if (len%2==0){
                        flag=true;
                    }else {
                        len++;
                    }
                    int time=0;
                    while (time<len/2){
                        sb.append('R');
                        time++;
                    }
                    time=0;
                    if (flag){
                        sb.append('.');
                    }
                    while (time<len/2){
                        sb.append('L');
                        time++;
                    }
                    i=j+1;
                    last=i;
                }
            }

        }
        while (last<dominoes.length()){
            sb.append('.');
            last++;
        }
        return sb.toString();
    }
}
