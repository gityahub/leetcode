package hot100;

public class Issue153_findMin {
    public static void main(String[] args) {
        findMin(new int[]{3,1,2});
    }
    public static int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        while (l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>nums[l]&&nums[mid]<nums[r]) {
                return nums[l];
            }
            else if(nums[mid]==nums[l]){
                   return nums[l]<nums[r]?nums[l]:nums[r];
            }
            else if(nums[mid]>nums[l]){
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return nums[l];
    }
}
