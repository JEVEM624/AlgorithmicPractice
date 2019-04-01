package leetcode;

import java.util.ArrayList;

/**
 * @Author JEVEM624
 * @Date 2019/3/31
 * @Version 1.0
 */
public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        if (root.left==null&&root.right==null){
            return root.val;
        }
        ArrayList<TreeNode> list = new ArrayList<>();
        if(root.left!=null){
            list.add(root.left);
        }
        if (root.right!=null){
            list.add(root.right);
        }
        return helper(list);
    }
    public int helper(ArrayList<TreeNode> list) {
        ArrayList<TreeNode> temp = new ArrayList<>();
        for (TreeNode i : list) {
            if (i.left != null) {
                temp.add(i.left);
            }
            if (i.right != null) {
                temp.add(i.right);
            }
        }
        if (temp.size() == 0) {
            return list.get(0).val;
        }
        return helper(temp);
    }
}
