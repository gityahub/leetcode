package hot100;

public class Issue543_DiameterOfBinaryTree {
    public static void main(String[] args) {

    }
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTree2(root);
        return max;
    }
    public int diameterOfBinaryTree2(TreeNode root) {
        if (root == null) return 0;
        int left = diameterOfBinaryTree2(root.left);
        int right = diameterOfBinaryTree2(root.right);
        max = Math.max(max, left+right);
        return Math.max(left, right)+1;
    }
}
