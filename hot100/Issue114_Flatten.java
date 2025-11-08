package hot100;

public class Issue114_Flatten {
    public static void main(String[] args) {
        TreeNode t=new TreeNode(1);
        t.left=new TreeNode(2);
        t.left.left=new TreeNode(3);
        t.left.right=new TreeNode(4);
        t.right=new TreeNode(5);
        t.right.right=new TreeNode(6);
        flatten(t);
    }
    public static void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.left);
        flatten(root.right);
        if(root.left!=null && root.right!=null){
            TreeNode left=root.left;
            TreeNode right=root.right;
            root.left=null;
            root.right=left;
            while(root.right!=null){
                root=root.right;
            }
            root.right=right;
        }
        else if (root.left!=null){
            TreeNode left=root.left;
            root.left=null;
            root.right=left;
        }
    }
}
