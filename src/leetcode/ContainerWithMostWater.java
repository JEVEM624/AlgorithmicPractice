package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/3
 * @Version 1.0
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] a={1,8,6,2,5,4,8,3,7};
        System.out.println(new ContainerWithMostWater().maxArea(a));
    }
    public int maxArea(int[] height) {
        int max=0;
        int first=0;
        int last=height.length-1;
        while(first!=last){
            int temp=Math.min(height[first],height[last])*(last-first);
            max=Math.max(temp, max);
            if (height[first]>height[last]){
                last--;
            }else {
                first++;
            }
        }
        return max;
    }
}
