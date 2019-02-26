package nowcoder;

/**
 * @Author JEVEM624
 * @Date 2019/2/25
 * @Version 1.0
 */
public class LongestSubstring {
    public static void main(String[] args) {
        String A="1AB2345CD";
        String B="12345EF";
        System.out.println(new LongestSubstring().findLongest(A,A.length(),B,B.length()));
    }
    public int findLongest(String A, int n, String B, int m) {
        int max=0;
        if(n==0||m==0){
            return 0;
        }
        int[][]status=new int[n+1][m+1];
        for (int i = 0; i <n+1 ; i++) {
            status[i][0]=0;
        }
        for (int i = 0; i < m+1; i++) {
            status[0][i]=0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(A.charAt(i-1)==B.charAt(j-1)){
                    status[i][j]=status[i-1][j-1]+1;
                }
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                max=max>status[i][j]?max:status[i][j];
            }
        }
        return max;
    }
}
