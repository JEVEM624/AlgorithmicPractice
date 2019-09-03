package leetcode;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author JEVEM624
 * @Date 2019/8/19
 * @Version 1.0
 */
public class MaximumLevelSumofaBinaryTree {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q1=new LinkedList();
        Queue<TreeNode> q2=new LinkedList<>();
        int max=root.val;
        q1.add(root);
        int sum=0;
        int level=1;
        int res=1;
        while (!q1.isEmpty()){
            TreeNode tmp=q1.poll();
            sum=sum+tmp.val;
            if (tmp.left!=null){
                q2.add(tmp.left);
            }
            if (tmp.right!=null){
                q2.add(tmp.right);
            }
            if (q1.isEmpty()){
                Queue tq=q1;
                q1=q2;
                q2=tq;

                if (sum>max){
                    max=sum;
                    res=level;
                }
                level++;
                sum=0;
            }
        }
        return res;
    }
}
