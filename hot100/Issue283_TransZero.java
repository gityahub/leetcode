package hot100;

public class Issue283_TransZero {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,0});
    }
    public static void moveZeroes(int[] nums) {
        for(int i=0,j=1;j<nums.length;i++,j++){
            if(nums[i]==0&&nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
            }
            else if(nums[i]==0&&nums[j]==0){
                while(nums[j]==0&&j<nums.length-1) j++;
                nums[i]=nums[j];
                nums[j]=0;
            }
        }

    }
}


//class Solution {
//    public void moveZeroes(int[] nums) {
//        int n = nums.length, left = 0, right = 0;
//        while (right < n) {
//            if (nums[right] != 0) {
//                swap(nums, left, right);
//                left++;
//            }
//            right++;
//        }
//    }
//
//    public void swap(int[] nums, int left, int right) {
//        int temp = nums[left];
//        nums[left] = nums[right];
//        nums[right] = temp;
//    }
//}
//
//作者：力扣官方题解
//链接：https://leetcode.cn/problems/move-zeroes/solutions/489622/yi-dong-ling-by-leetcode-solution/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。