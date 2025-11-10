package hot100;

import java.util.ArrayList;
import java.util.List;

public class Issue236_LowestCommonAncestor {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(5);
        root.right=new TreeNode(1);
        root.left.left=new TreeNode(6);
        root.left.right=new TreeNode(2);
        root.right.left=new TreeNode(0);
        root.right.right=new TreeNode(8);
        root.left.right.left=new TreeNode(7);
        root.left.right.right=new TreeNode(4);
        TreeNode p=root.left.right; //7
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> res1=new ArrayList<>();
        List<TreeNode> res2=new ArrayList<>();
        findPath(res1,root,p);
        findPath(res2,root,q);
        for(int i=0;i<res1.size();i++){
            for(int j=0;j<res2.size();j++){
                if(res1.get(i).equals(res2.get(j))){
                    return res1.get(i);
                }
            }
        }
        return null;
    }
    public static Boolean findPath(List<TreeNode> res,TreeNode root, TreeNode q) {
        if(root==null) return false;
        if(root==q){
            res.add(root);
            return true;
        }
        if(findPath(res,root.left, q) || findPath(res,root.right, q)){
            res.add(root);
            return true;
        }
        return false;
    }
}
