package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/18
 * @Version 1.0
 */
public class LowestCommonAncestorofaBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((p.val>=root.val&&q.val<=root.val)||(p.val<=root.val&&q.val>=root.val)){
            return root;
        }
        if (p.val<root.val){
            return lowestCommonAncestor(root.left, p, q);
        }else{
            return lowestCommonAncestor(root.right, p, q);
        }
    }
}
