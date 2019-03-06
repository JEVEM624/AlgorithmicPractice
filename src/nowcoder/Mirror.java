package nowcoder;

/**
 * @Author JEVEM624
 * @Date 2019/3/6
 * @Version 1.0
 */
public class Mirror {
    public void Mirror(TreeNode root) {
        if (root==null){
            return;
        }else {
            TreeNode right=root.right;
            root.right=root.left;
            root.left=right;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}
