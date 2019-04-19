package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/4/19
 * @Version 1.0
 */
public class MaximumDifferenceBetweenNodeandAncestor {
    public int maxAncestorDiff(TreeNode root) {
        return helper(root, root.val, root.val, 0);
    }
    public int helper(TreeNode root,int max,int min,int result){
        if (root==null){
            return result;
        }
        int val=Math.max(Math.abs(root.val-max), Math.abs(root.val-min));
        val=Math.max(val,result);
        max=Math.max(max, root.val);
        min=Math.min(min, root.val);
        return Math.max(helper(root.left, max, min, val), helper(root.right, max, min, val));
    }
}
