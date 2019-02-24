package leetcode;

import java.util.Arrays;

/**
 * @Author JEVEM624
 * @Date 2019/2/24
 * @Version 1.0
 */
public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0){
            return null;
        }
        int max=-1;
        int locate=-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                locate=i;
                max=nums[i];
            }
        }
        TreeNode treeNode=new TreeNode(max);
        if(locate>0){
            treeNode.left=constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, locate));
        }else {
            treeNode.left=null;
        }
        if(locate<nums.length-1){
            treeNode.right=constructMaximumBinaryTree(Arrays.copyOfRange(nums, locate+1, nums.length));
        }else{
            treeNode.right=null;
        }
        return treeNode;
    }
}
