package hot100;

import java.util.ArrayDeque;
import java.util.Deque;

public class Issue437_PathSum {
    public static void main(String[] args) {

    }

    public int pathSum(TreeNode root, int targetSum) {
        int res=0;
        if(root==null){
            return 0;
        }
        Deque<TreeNode> stack=new ArrayDeque<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            res+=pathSum2(node,targetSum);
            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
        }
        return res;
    }
    public int pathSum2(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int res=0;
        if(root.val==targetSum) res++;
        res+=pathSum2(root.left,targetSum-root.val);
        res+=pathSum2(root.right,targetSum-root.val);
        return res;
    }
}
