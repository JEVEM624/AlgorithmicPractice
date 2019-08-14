package leetcode;

import java.util.*;

/**
 * @Author JEVEM624
 * @Date 2019/5/15
 * @Version 1.0
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        helper(res, queue);
        return res;
    }

    public void helper(List<Integer> res, Deque<TreeNode> queue) {
        if (queue.isEmpty()) {
            return;
        }
        Deque<TreeNode> queue1 = new LinkedList<>();
        TreeNode poin = null;
        res.add(queue.peekLast().val);
        while (!queue.isEmpty()) {
            poin = queue.poll();
            if (poin.left != null) {
                queue1.add(poin.left);
            }
            if (poin.right != null) {
                queue1.add(poin.right);
            }
        }
        helper(res, queue1);
    }
}
