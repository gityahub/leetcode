package hot100;

import java.util.Arrays;
import java.util.HashMap;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int [] nums = new int[]{3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                if(map.get(target - nums[i]) != i) {
                    return new int[]{map.get(target - nums[i]), i};
                }
            }
        }
        return null;
    }
}


//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; ++i) {
//            if (hashtable.containsKey(target - nums[i])) {
//                return new int[]{hashtable.get(target - nums[i]), i};
//            }
//            hashtable.put(nums[i], i);
//        }
//        return new int[0];
//    }
//}
//
//作者：力扣官方题解
//链接：https://leetcode.cn/problems/two-sum/solutions/434597/liang-shu-zhi-he-by-leetcode-solution/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。