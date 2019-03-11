package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/11
 * @Version 1.0
 */
public class SearchinaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        if (root.val>val){
            return searchBST(root.left, val);
        }else {
            return searchBST(root.right, val);
        }
    }
}
