package leetcode;

import java.util.Stack;

/**
 * @Author JEVEM624
 * @Date 2019/5/5
 * @Version 1.0
 */
public class BinarySearchTreetoGreaterSumTree {
    public TreeNode bstToGst(TreeNode root) {
        if (root == null) {
            return root;
        }
        int val = helper(root);
        Stack<TreeNode>stack=new Stack<>();
        stack.push(root);
        TreeNode now=root.left;
        while (!stack.isEmpty()||now!=null){
            if (now!=null){
                stack.push(now);
                now=now.left;
            }else {
                now=stack.pop();
                int temp=val-now.val;
                now.val=val;
                val=temp;
                now=now.right;
            }
        }
        return root;
    }

    public int helper(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        return left+right+root.val;
    }
}
