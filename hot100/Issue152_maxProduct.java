package hot100;

public class Issue152_maxProduct {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2,-5,-2,-4,3}));
    }
    public static int maxProduct(int[] nums) {
        int length = nums.length;
        long[] maxF = new long[length];
        long[] minF = new long[length];
        for (int i = 0; i < length; i++) {
            maxF[i] = nums[i];
            minF[i] = nums[i];
        }
        for (int i = 1; i < length; ++i) {
            maxF[i] = Math.max(maxF[i - 1] * nums[i], Math.max(nums[i], minF[i - 1] * nums[i]));
            minF[i] = Math.min(minF[i - 1] * nums[i], Math.min(nums[i], maxF[i - 1] * nums[i]));
            if (minF[i] < (-1 << 31)) {
                minF[i] = nums[i];
            }
        }
        int ans = (int) maxF[0];
        for (int i = 1; i < length; ++i) {
            ans = Math.max(ans, (int) maxF[i]);
        }
        return ans;
    }
}


//class Solution {
//    public int maxProduct(int[] nums) {
//        int length = nums.length;
//        long[] maxF = new long[length];
//        long[] minF = new long[length];
//        for (int i = 0; i < length; i++) {
//            maxF[i] = nums[i];
//            minF[i] = nums[i];
//        }
//        for (int i = 1; i < length; ++i) {
//            maxF[i] = Math.max(maxF[i - 1] * nums[i], Math.max(nums[i], minF[i - 1] * nums[i]));
//            minF[i] = Math.min(minF[i - 1] * nums[i], Math.min(nums[i], maxF[i - 1] * nums[i]));
//            if (minF[i] < (-1 << 31)) {
//                minF[i] = nums[i];
//            }
//        }
//        int ans = (int) maxF[0];
//        for (int i = 1; i < length; ++i) {
//            ans = Math.max(ans, (int) maxF[i]);
//        }
//        return ans;
//    }
//}
