package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/18
 * @Version 1.0
 */
public class LowestCommonAncestorofaBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null){
            return null;
        }
        if (root.val==p.val||root.val==q.val){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left, p, q);
        TreeNode right=lowestCommonAncestor(root.right, p, q);
        if (left!=null&&right!=null){
            return root;
        }
        if (left!=null){
            return left;
        }else {
            return right;
        }
    }
}
