package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author JEVEM624
 * @Date 2019/5/6
 * @Version 1.0
 */
public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        new BinaryTreeLevelOrderTraversal().levelOrder(new TreeNode(1));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        List<List<Integer>>res=new ArrayList<>();
        if (root==null){
            return res;
        }
        int num=1;
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer>tmp=new ArrayList<>();
            int k=0;
            for (int i = 0; i < num; i++) {
                TreeNode now=queue.poll();
                tmp.add(now.val);
                if (now.left!=null){
                    queue.add(now.left);
                    k++;
                }
                if (now.right!=null){
                    queue.add(now.right);
                    k++;
                }
            }
            res.add(tmp);
            num=k;
        }
        queue.add(root);
        return res;
    }
}
