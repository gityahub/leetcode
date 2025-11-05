package hot100;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Issue101_IsSymmetric {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null) return true;
        if(root.left == null || root.right == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()){
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            if(node1 == null && node2 == null) continue;
            if(node1 == null || node2 == null) return false;
            if(node1.val != node2.val) return false;
            queue.offer(node1.left);
            queue.offer(node2.right);
            queue.offer(node1.right);
            queue.offer(node2.left);
        }
        return true;
    }
}
