package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Issue128_LongestSeries {
    public static void main(String[] args) {
        int[] n =new int[]{0};
        System.out.println(longestConsecutive(n));
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int num : nums) set.add(num);
        if (set.isEmpty()) return 0;
        for(int num:set){
            if(set.contains(num-1)&&!set.contains(num+1)){
                right.add(num);
            }
            if(!set.contains(num-1)&&set.contains(num+1)){
                left.add(num);
            }
        }
        Collections.sort(left);
        Collections.sort(right);

        int max=0;
        for (int i = 0; i < right.size(); i++) {
            if(max< right.get(i)-left.get(i))  max=right.get(i)-left.get(i);
        }
        return max+1;
    }
}


//class Solution {
//    public int longestConsecutive(int[] nums) {
//        Set<Integer> num_set = new HashSet<Integer>();
//        for (int num : nums) {
//            num_set.add(num);
//        }
//
//        int longestStreak = 0;
//
//        for (int num : num_set) {
//            if (!num_set.contains(num - 1)) {
//                int currentNum = num;
//                int currentStreak = 1;
//
//                while (num_set.contains(currentNum + 1)) {
//                    currentNum += 1;
//                    currentStreak += 1;
//                }
//
//                longestStreak = Math.max(longestStreak, currentStreak);
//            }
//        }
//
//        return longestStreak;
//    }
//}
//
//作者：力扣官方题解
//链接：https://leetcode.cn/problems/longest-consecutive-sequence/solutions/276931/zui-chang-lian-xu-xu-lie-by-leetcode-solution/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。