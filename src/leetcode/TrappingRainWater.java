package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/14
 * @Version 1.0
 */
public class TrappingRainWater {
    public int trap(int[] height) {

        int left=0;
        int right=height.length-1;
        if(right<0){
            return 0;
        }
        while (left<height.length-1&&height[left]==0){
            left++;
        }
        while (right>0&&height[right]==0){
            right--;
        }
        int lmax=height[left];
        int rmax=height[right];
        int sum=0;
        while (left<=right){
            if (height[left]<height[right]){
                if (height[left]<lmax){
                    sum=sum+lmax-height[left];
                }else {
                    lmax=height[left];
                }
                left++;
            }else {
                if (height[right]<rmax){
                    sum=sum+rmax-height[right];
                }else {
                    rmax=height[right];
                }
                right--;
            }
        }
        return sum;
    }
}
