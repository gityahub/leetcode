package hot100;

public class Issue35_searchInsert {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6},7));
    }
    public static int searchInsert(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);
    }

    public static int search(int[] nums, int target, int start, int end){
        if(nums.length<1) return -1;
        if(start==end) {
            if(nums[start]<target)
            return start+1;
            else return start;
        }
        int mid=(end+start)/2;
        if(nums[mid]==target) return mid;
        if(nums[mid]>target) return search(nums,target,start,mid);
        return search(nums,target,mid+1,end);
    }
}
