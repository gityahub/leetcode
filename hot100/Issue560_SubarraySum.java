package hot100;

public class Issue560_SubarraySum {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3,4,5}, 6));
    }
    public static int subarraySum(int[] nums, int k) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i ; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    ans++;
                }
            }
        }
        return ans;
    }
}
//public class Solution {
//    public int subarraySum(int[] nums, int k) {
//        int count = 0, pre = 0;
//        HashMap < Integer, Integer > mp = new HashMap < > ();
//        mp.put(0, 1);
//        for (int i = 0; i < nums.length; i++) {
//            pre += nums[i];
//            if (mp.containsKey(pre - k)) {
//                count += mp.get(pre - k);
//            }
//            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
//        }
//        return count;
//    }
//}
//
//作者：力扣官方题解
//链接：https://leetcode.cn/problems/subarray-sum-equals-k/solutions/238572/he-wei-kde-zi-shu-zu-by-leetcode-solution/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。