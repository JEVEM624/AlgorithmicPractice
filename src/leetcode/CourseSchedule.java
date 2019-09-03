package leetcode;

import java.util.*;

/**
 * @Author JEVEM624
 * @Date 2019/8/19
 * @Version 1.0
 */
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>>map=new HashMap<>();
        int[]n=new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            n[prerequisites[i][0]]++;
            List tmpL=map.get(prerequisites[i][1]);
            if (tmpL==null){
                tmpL=new ArrayList();
                tmpL.add(prerequisites[i][0]);
                map.put(prerequisites[i][1],tmpL);
            }else {
                tmpL.add(prerequisites[i][0]);
            }
        }
        Queue<Integer>queue=new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (n[i]==0){
                queue.add(i);
            }
        }
        int sum=0;
        while (!queue.isEmpty()){
            sum++;
            int poin=queue.poll();
            List<Integer> tmpl=map.getOrDefault(poin, new ArrayList<>());
            for (int i = 0; i < tmpl.size(); i++) {
                n[tmpl.get(i)]--;
                if (n[tmpl.get(i)]==0){
                    queue.add(tmpl.get(i));
                }
            }
        }
        return sum==numCourses;
    }
}
