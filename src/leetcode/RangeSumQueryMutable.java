package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/19
 * @Version 1.0
 */
public class RangeSumQueryMutable {
    int[]sum;
    int[]nums;
    public RangeSumQueryMutable(int[] nums) {
        this.nums=nums;
        sum=new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            int k=i+1;
            while (k<sum.length){
                this.sum[k]=this.sum[k]+nums[i];
                k+=lowbit(k);
            }
        }
    }
    int lowbit(int i){
        return i&(-i);
    }
    int find(int i){
        int sum=0;
        while (i>0){
            sum=sum+this.sum[i];
            i-=lowbit(i);
        }
        return sum;
    }
    public void update(int i, int val) {
        int num=val;
        val=val-this.nums[i];
        nums[i]=num;
        i++;
        while (i<sum.length){
            this.sum[i]+=val;
            i+=lowbit(i);
        }
    }

    public int sumRange(int i, int j) {
        return find(j+1)-find(i);
    }
}
