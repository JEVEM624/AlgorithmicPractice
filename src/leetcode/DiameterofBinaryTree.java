package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/20
 * @Version 1.0
 */
public class DiameterofBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1);
        treeNode.left=new TreeNode(2);
        new DiameterofBinaryTree().diameterOfBinaryTree(treeNode);
    }
    int MAX=0;
    public int diameterOfBinaryTree(TreeNode root) {
        int max=helper(root);
        return Math.max(max-1, MAX);
    }
    public int helper(TreeNode root){
        if (root==null){
            return 0;
        }else {
            int left=helper(root.left);
            int right=helper(root.right);
            MAX=Math.max(MAX, left+right);
            return Math.max(left,right)+1;
        }
    }
}
