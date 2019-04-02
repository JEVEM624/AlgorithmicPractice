package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/4/2
 * @Version 1.0
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        String temp = String.valueOf(root.val);
        if (root.left == null && root.right == null) {
            result.add(temp);
            return result;
        }
        if (root.left != null) {
            helper(result, temp, root.left);
        }
        if (root.right != null) {
            helper(result, temp, root.right);
        }
        return result;
    }

    public void helper(List<String> result, String temp, TreeNode root) {
        temp = temp + "->" + root.val;
        if (root.left != null) {
            helper(result, temp, root.left);
        }
        if (root.right != null) {
            helper(result, temp, root.right);
        }
        if (root.left == null && root.right == null) {
            result.add(temp);
            return;
        }
    }
}
