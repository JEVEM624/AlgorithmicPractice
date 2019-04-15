package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/4/7
 * @Version 1.0
 */
public class SumofRootToLeafBinaryNumbers {

    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }
        long result = helper(root, 0);
        return (int) result % (1000000007);
    }

    public long helper(TreeNode root, long val) {
        if (root.left == null && root.right == null) {
            return ((val << 1) + root.val)% (1000000007);
        }
        val = ((val << 1) + root.val)% (1000000007);
        long left = 0;
        if (root.left != null) {
            left = helper(root.left, val);
        }
        long right = 0;
        if (root.right != null) {
            right = helper(root.right, val);
        }
        return (left + right) % (1000000007);
    }
}
