package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author JEVEM624
 * @Date 2019/1/21
 * @Version 1.0
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[0]);
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                index = i;
                break;
            }
        }
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, index);
        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, 1 + leftInorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder, index + 1, inorder.length);
        int[] rightPreorder = Arrays.copyOfRange(preorder, inorder.length - rightInorder.length, inorder.length);
        treeNode.left = buildTree(leftPreorder, leftInorder);
        treeNode.right = buildTree(rightPreorder, rightInorder);
        return treeNode;
    }
}
