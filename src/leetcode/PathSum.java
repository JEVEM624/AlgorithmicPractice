package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/26
 * @Version 1.0
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null){
            return false;
        }
        if (sum-root.val==0&& root.left==null&&root.right==null){
            return true;
        }else {
            return hasPathSum(root.left, sum-root.val)|hasPathSum(root.right, sum-root.val);
        }
    }
}
