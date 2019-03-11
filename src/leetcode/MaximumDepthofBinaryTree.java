package leetcode;

import sun.reflect.generics.tree.Tree;

/**
 * @Author JEVEM624
 * @Date 2019/3/11
 * @Version 1.0
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
