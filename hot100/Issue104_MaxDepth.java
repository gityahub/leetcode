package hot100;

public class Issue104_MaxDepth {
    public static void main(String[] args) {
        // 构造示例二叉树 [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // 调试调用
        Issue104_MaxDepth solution = new Issue104_MaxDepth();
        int depth = solution.maxDepth(root);
        System.out.println("最大深度为：" + depth);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}