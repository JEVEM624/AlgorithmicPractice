package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/4/16
 * @Version 1.0
 */
public class SingleNumberIII {
    public static void main(String[] args) {
        new SingleNumberIII().singleNumber(new int[]{1,2,1,3,2,5});
    }
    public int[] singleNumber(int[] nums) {
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            num=num^nums[i];
        }
        int i=0;
        while (true){
            if ((num&1)==1){
                break;
            }
            num=num>>1;
            i++;
        }
        int index=1;
        index=index<<i;
        num=0;
        for (int j = 0; j < nums.length; j++) {
            num=num^((nums[j]&index)>0?nums[j]:0);
        }
        int[]result=new int[2];
        result[0]=num;
        num=0;
        for (int j = 0; j < nums.length; j++) {
            num=num^((nums[j]&index)>0?0:nums[j]);
        }
        result[1]=num;
        return result;
    }
}
