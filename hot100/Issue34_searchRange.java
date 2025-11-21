package hot100;

public class Issue34_searchRange {
    public static void main(String[] args) {
        searchRange(new int[]{2,2},2);
    }
    public static int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1, -1};
        int left=0;int right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(target<nums[mid]){
                right=mid-1;
            }
            else if(target>nums[mid]){
                left=mid+1;
            }
            else {
                left=mid;
                right=mid;
                break;
            }
        }
        if(nums[(left+right)/2]!=target) return new int[]{-1, -1};
        while(left>=0&&nums[left]==target){
            left--;
        }
        while (right<=nums.length-1&&nums[right]==target){
            right++;
        }
        return new int[]{left+1, right-1};
    }
}
