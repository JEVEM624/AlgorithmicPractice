package leetcode;

import sun.reflect.generics.tree.Tree;

/**
 * @Author JEVEM624
 * @Date 2019/3/28
 * @Version 1.0
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        if (isBalanced(root.left)&&isBalanced(root.right)){
            int left=helper(root.left);
            int right=helper(root.right);
            return Math.abs(left-right)<2;
        }else {
            return false;
        }
    }
    public int helper (TreeNode root){
        if (root==null){
            return 0;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        return Math.max(left, right)+1;
    }
}
