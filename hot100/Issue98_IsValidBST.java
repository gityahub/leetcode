package hot100;

public class Issue98_IsValidBST {
    public static void main(String[] args) {

    }
    int max=Integer.MIN_VALUE;
    int flag=0;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if(!isValidBST(root.left)){
            return false;
        }
        if(flag==0){
            max=root.val;
            flag=1;
        }
        else {if (max<root.val){
            max=root.val;
        }
        else return false;}
        if(!isValidBST(root.right)){
            return false;
        }
        return true;
    }
}
