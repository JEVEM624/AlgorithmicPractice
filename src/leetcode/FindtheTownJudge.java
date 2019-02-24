package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/24
 * @Version 1.0
 */
public class FindtheTownJudge {
    public int findJudge(int N, int[][] trust) {
        int judge=-1;
        int[]people=new int[N];
        int[]t=new int[N];
        for (int i = 0; i < N; i++) {
            people[i]=0;
            t[i]=-1;
        }
        for (int i = 0; i < trust.length; i++) {
            people[trust[i][1]-1]++;
            t[trust[i][0]-1]=trust[i][1]-1;
        }
        for (int i = 0; i < N; i++) {
            if(people[i]==N-1&&t[i]==-1){
                judge=i+1;
            }
        }
        return judge;
    }
}
