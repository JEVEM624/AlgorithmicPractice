package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author JEVEM624
 * @Date 2019/3/8
 * @Version 1.0
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root==null){
            return true;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        TreeNode now=root.left;
        long val=Long.MIN_VALUE;
        while (!stack.isEmpty()||now!=null){
            if (now!=null){
                stack.push(now);
                now=now.left;
            }else {
                now=stack.pop();
                if (val>=now.val){
                    return false;
                }
                val=now.val;
                now=now.right;
            }
        }
        return true;
    }
}
