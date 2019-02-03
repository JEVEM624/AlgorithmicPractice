package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/3
 * @Version 1.0
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        new MergeSortedArray().merge(new int[]{4,5,6,0,0,0}, 3, new int[]{1,2,3}, 3);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m=m-1;
        n=n-1;
        int last=nums1.length-1;
        while (last>0){
            if(m>=0&&n>=0){
                if(nums1[m]>nums2[n]) {
                    nums1[last] = nums1[m];
                    last--;
                    m--;
                }else{
                    nums1[last]=nums2[n];
                    last--;
                    n--;
                }
            }else if(n<0){
                break;
            }else if(m<0){
                for (int i = n; i >=0 ; i--) {
                    nums1[last]=nums2[i];
                    last--;
                }
            }
        }
    }
}
