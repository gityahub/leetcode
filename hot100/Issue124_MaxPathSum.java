package hot100;

public class Issue124_MaxPathSum {
    public static void main(String[] args) {

    }
    static int res=Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root) {
        res=Integer.MIN_VALUE;
        maxPathSum1(root);
        return res;
    }
    public static int maxPathSum1(TreeNode root) {
        if(root==null) return 0;
        int left=Math.max(0,maxPathSum1(root.left));
        int right=Math.max(0,maxPathSum1(root.right));
        res=Math.max(res,root.val+left+right);
        return root.val+Math.max(left,right);
    }

}
