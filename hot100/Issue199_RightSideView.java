package hot100;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Issue199_RightSideView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.left.right = new TreeNode(4);
        rightSideView(root);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Deque<TreeNode> queue=new LinkedList<>();
        List<Integer> res=new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(i==size-1) res.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);

            }
        }
        return res;
    }
}
