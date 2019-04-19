package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/4/19
 * @Version 1.0
 */
public class PathSumII {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(11);
        root.left.left.right=new TreeNode(2);
        new PathSumII().pathSum(root, 22);
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>>result=new ArrayList<>();
        helper(root, sum, 0, result, new LinkedList<>());
        return result;
    }
    public void helper(TreeNode root,int target,int now,List<List<Integer>>result,List<Integer>temp){
        if (root==null){
            return;
        }
        now=now+root.val;
        temp.add(root.val);
        if (root.left==null&&root.right==null&&now==target){
            ArrayList<Integer>temp2=new ArrayList<>();
            temp2.addAll(temp);
            result.add(temp2);
            temp.remove(temp.size()-1);
            return;
        }
        helper(root.left,target,now,result,temp);
        helper(root.right,target,now,result,temp);
        temp.remove(temp.size()-1);
        return;
    }
}
