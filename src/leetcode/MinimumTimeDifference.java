package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/3/20
 * @Version 1.0
 */
public class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        List<Integer>time=new ArrayList<>();
        for (String i:timePoints){
            String[]temp=i.split(":");
            int h=Integer.valueOf(temp[0]);
            int m=Integer.valueOf(temp[1]);
            time.add(h*60+m);
        }
        Collections.sort(time);
        int min=0;
        for (int i = 1; i < time.size(); i++) {
            min=Math.min(min, time.get(i)-time.get(i-1));
        }
        min=Math.min(min, Math.abs(time.get(time.size()-1)-1440-time.get(0)));
        return min;
    }
}
