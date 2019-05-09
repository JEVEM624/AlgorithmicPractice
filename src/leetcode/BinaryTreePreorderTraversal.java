package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author JEVEM624
 * @Date 2019/5/9
 * @Version 1.0
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode now;
        while (!stack.isEmpty()) {
            now = stack.pop();
            res.add(now.val);
            if (now.right != null) {
                stack.push(now.right);
            }
            if (now.left != null) {
                stack.push(now.left);
            }
        }
        return res;
    }
}
