package hot100;

import java.util.Arrays;

public class Issue105_BuildTree {
    public static void main(String[] args) {

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||preorder.length==0||inorder==null||inorder.length==0){return null;}
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode cur = root;
        int index = 0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==preorder[0]){
                index=i;
            }
        }
        int[] preorder_left=Arrays.copyOfRange(preorder,1,index+1);
        int[] preorder_right=Arrays.copyOfRange(preorder,index+1,preorder.length);
        int[] inorder_left=Arrays.copyOfRange(inorder,0,index);
        int[] inorder_right=Arrays.copyOfRange(inorder,index+1,inorder.length);
        root.left=buildTree(preorder_left,inorder_left);
        root.right=buildTree(preorder_right,inorder_right);
        return root;
    }
}
