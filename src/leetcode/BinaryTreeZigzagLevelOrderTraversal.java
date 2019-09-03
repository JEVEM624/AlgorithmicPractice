package leetcode;

import java.util.*;

/**
 * @Author JEVEM624
 * @Date 2019/8/15
 * @Version 1.0
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode>stack2=new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        stack1.push(root);
        while (!stack1.isEmpty()) {

            List<Integer> list = new ArrayList<>();
            while (stack1.size()>0) {
                TreeNode t = stack1.pop();
                if (t.left != null) {
                    stack2.push(t.left);
                }
                if (t.right != null) {
                    stack2.push(t.right);
                }
                list.add(t.val);
            }
            res.add(list);

            List<Integer> list1 = new ArrayList<>();
            while (stack2.size()>0) {
                TreeNode t = stack2.pop();
                if (t.right != null) {
                    stack1.add(t.right);
                }if (t.left != null) {
                    stack1.add(t.left);
                }

                list1.add(t.val);
            }
            if (list1.size()>0){
                res.add(list1);
            }

        }
        return res;
    }
}
