package hot100;

public class Issue108_SortedArrayToBST {
    public static void main(String[] args) {

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==1)return new TreeNode(nums[0]);
        int mid=nums.length/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=sortedArrayToBST2(nums,0,mid-1);
        root.right=sortedArrayToBST2(nums,mid+1,nums.length-1);
        return root;
    }
    public TreeNode sortedArrayToBST2(int[] nums, int low, int high) {
        if(low>high)return null;
        int mid=low+(high-low)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=sortedArrayToBST2(nums,low,mid-1);
        root.right=sortedArrayToBST2(nums,mid+1,high);
        return root;
    }
}
