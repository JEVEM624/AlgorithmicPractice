package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/28
 * @Version 1.0
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int red=0,blue=0,white=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                red++;
            }else if(nums[i]==1){
                white++;
            }else {
                blue++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(red!=0){
                nums[i]=0;
                red--;
                continue;
            }else if(white!=0){
                nums[i]=1;
                white--;
                continue;
            }else {
                nums[i]=2;
            }
        }
    }
}
