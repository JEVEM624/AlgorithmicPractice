package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/25
 * @Version 1.0
 */
public class FlattenBinaryTreetoLinkedList {
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        if (root.right!=null){
            flatten(root.right);
        }
        if (root.left!=null){
            flatten(root.left);
            TreeNode right=helper(root.left);
            right.right=root.right;
            root.right=root.left;
            root.left=null;
            return;
        }
    }
    public TreeNode helper(TreeNode root){
        if (root.right==null){
            return root;
        }else {
            return helper(root.right);
        }
    }
}
