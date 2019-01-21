package leetcode;

import java.util.ArrayList;

/**
 * @Author JEVEM624
 * @Date 2019/1/21
 * @Version 1.0
 */
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sum(root, 0);
    }

    public static int sum(TreeNode root, int num) {
        if (root.left == null && root.right == null) {
            return num * 10 + root.val;
        }
        if (root.left != null && root.right == null) {
            return sum(root.left, num * 10 + root.val);
        } else if (root.right != null && root.left == null) {
            return sum(root.right, num * 10 + root.val);
        } else {
            return sum(root.left, num * 10 + root.val) + sum(root.right, num * 10 + root.val);
        }
    }
}
