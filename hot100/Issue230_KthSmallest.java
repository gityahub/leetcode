package hot100;

public class Issue230_KthSmallest {
    public static void main(String[] args) {

    }
    int count=0;
    int res=0;
    public int kthSmallest(TreeNode root, int k) {
        if (root==null) return -1;
        res=kthSmallest(root.left,k);
        if(res!=-1) return res;
        count++;
        if(count==k)return root.val;
        res=kthSmallest(root.right,k);
        return res;
    }
}
