package leetcode;

import java.util.Arrays;

/**
 * @Author JEVEM624
 * @Date 2019/3/29
 * @Version 1.0
 */
public class BoatstoSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int sum=0;
        int i=0;
        int j=people.length-1;
        while (i<j){
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
                sum++;
            }else {
                j--;
                sum++;
            }
        }
        if (i==j){
            sum++;
        }
        return sum;
    }
}
