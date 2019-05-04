package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author JEVEM624
 * @Date 2019/5/4
 * @Version 1.0
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer>res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<TreeNode>stack=new Stack<>();
        TreeNode now=root;
        stack.push(now);
        now=now.left;
        while (!stack.isEmpty()||now!=null){
            if (now!=null){
                stack.push(now);
                now=now.left;
            }else {
                now=stack.pop();
                res.add(now.val);
                now=now.right;
            }
        }
        return res;
    }
}
