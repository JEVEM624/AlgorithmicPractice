package nowcoder;

import java.util.Arrays;

/**
 * @Author JEVEM624
 * @Date 2019/3/6
 * @Version 1.0
 */
public class ReConstructBinaryTree {
    public static void main(String[] args) {
        new ReConstructBinaryTree().reConstructBinaryTree(new int[]{1,2,4,7,3,5,6,8},
                new int[]{4,7,2,1,5,3,8,6});
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length==0){
            return null;
        }
        TreeNode root=new TreeNode(pre[0]);
        int index=0;
        for (int i = 0; i < in.length; i++) {
            if (in[i]==pre[0]){
                index=i;
                break;
            }
        }
        int[]inleft= Arrays.copyOfRange(in, 0, index);
        int[]inright=Arrays.copyOfRange(in, index+1, in.length);
        int[]preleft=Arrays.copyOfRange(pre, 1, 1+inleft.length);
        int[]preright=Arrays.copyOfRange(pre, index+1, pre.length);
        root.left=reConstructBinaryTree(preleft,inleft);
        root.right=reConstructBinaryTree(preright, inright);
        return root;
    }
}
