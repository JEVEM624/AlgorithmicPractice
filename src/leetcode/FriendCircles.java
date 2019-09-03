package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/22
 * @Version 1.0
 */
public class FriendCircles {
    public int findCircleNum(int[][] M) {
        int[]sta=new int[M.length];
        for (int i = 0; i < sta.length; i++) {
            sta[i]=i;
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = i+1; j < M.length; j++) {
                if (M[i][j]==1){
                    if (sta[i]!=sta[j]){
                        int min=Math.min(sta[i],sta[j]);
                        int max=Math.max(sta[i],sta[j]);
                        for (int k = 0; k < sta.length; k++) {
                            if (sta[k]==max){
                                sta[k]=min;
                            }
                        }
                    }
                }
            }
        }
        int res=0;
        for (int i = 0; i < sta.length; i++) {
            if (sta[i]==i){
                res++;
            }
        }
        return res;
    }
}
