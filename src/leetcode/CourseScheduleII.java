package leetcode;

import java.util.*;

/**
 * @Author JEVEM624
 * @Date 2019/8/15
 * @Version 1.0
 */
public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[]first=new int[numCourses];
        Map<Integer, List<Integer>>map=new HashMap<>(numCourses);
        for (int i = 0; i < prerequisites.length; i++) {
            int fir=prerequisites[i][1];
            int sec=prerequisites[i][0];
            first[sec]++;
            List tmp=map.get(fir);
            if (tmp==null){
                tmp=new ArrayList();
                tmp.add(sec);
                map.put(fir, tmp);
            }else {
                tmp.add(sec);
            }

        }
        Queue<Integer>queue=new LinkedList<>();
        for (int i = 0; i < first.length; i++) {
            if (first[i]==0){
                queue.add(i);
            }
        }
        List<Integer>list=new ArrayList<>();
        while (!queue.isEmpty()){
            int c=queue.poll();
            list.add(c);
            first[c]=-1;
            List<Integer> tmp=map.get(c);
            if (tmp==null){
                continue;
            }
            for (int i = 0; i < tmp.size(); i++) {
                int l=tmp.get(i);
                first[l]--;
                if (first[l]==0){
                    queue.add(l);
                }
            }
        }
        if (list.size()!=numCourses){
            return new int[0];
        }
        int[]res=new int[numCourses];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }
        return res;
    }
}
