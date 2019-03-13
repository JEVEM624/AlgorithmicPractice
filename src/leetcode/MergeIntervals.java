package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/3/12
 * @Version 1.0
 */
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() == 0) {
            return new ArrayList<>();
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        List<Interval> result = new ArrayList<>();
        result.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start <= result.get(result.size() - 1).end) {
                result.get(result.size() - 1).end = Math.max(result.get(result.size() - 1).end, intervals.get(i).end);
            } else {
                result.add(intervals.get(i));
            }
        }
        return result;
    }
}
