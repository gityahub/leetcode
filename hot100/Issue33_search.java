package hot100;

public class Issue33_search {
    public static void main(String[] args) {
        search(new int[]{1,3},3);
    }
    public static int search(int[] nums, int target) {
        int left=0;int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target>nums[mid]){
                if(nums[mid]>=nums[left]){
                    left=mid+1;
                }
                else {
                    if(target>=nums[left]){
                        right=mid-1;
                    }
                    else {
                        left=mid+1;
                    }
                }
            }
            else if(target<nums[mid]){
                if(nums[mid]>=nums[left]){
                    if(nums[left]<=target){
                        right=mid-1;
                    }
                    else {
                        left=mid+1;
                    }
                }
                else {
                    right=mid-1;
                }
            }
            else return mid;
        }
        return -1;
    }
}
