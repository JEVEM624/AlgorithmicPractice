package nowcoder;

import java.util.HashMap;

/**
 * @Author JEVEM624
 * @Date 2019/3/6
 * @Version 1.0
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return false;
        } else {
            return HasSubtree2(root1, root2);
        }
    }

    public boolean HasSubtree2(TreeNode root1, TreeNode root2) {

        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            if (HasSubtree2(root1.left, root2.left) && HasSubtree2(root1.right, root2.right)) {
                return true;
            } else {
                return HasSubtree2(root1.left, root2) || HasSubtree2(root1.right, root2);
            }
        } else {
            return HasSubtree2(root1.left, root2) || HasSubtree2(root1.right, root2);
        }
    }
}
