package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/5/14
 * @Version 1.0
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length<1){
            return 0;
        }
        if(gas.length==1){
            return gas[0]>=cost[0]?0:-1;
        }
        boolean[] flag=new boolean[gas.length];
        for (int i = 0; i < gas.length; i++) {
            if (gas[i]>=cost[i]){
                flag[i]=true;
            }
        }

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]){
                int load=0;
                boolean t=false;
                for (int j = 0; j < cost.length; j++) {
                    load=load+gas[(i+j)%(cost.length)]-cost[(i+j)%(cost.length)];
                    if (load<0){
                        t=false;
                        break;
                    }
                    t=true;
                }
                if (t){
                    return i;
                }
            }
        }
        return -1;
    }
}
