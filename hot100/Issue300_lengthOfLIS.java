package hot100;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Issue300_lengthOfLIS {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{1,3,6,7,9,4,10,5,6}));
    }
    public static int lengthOfLIS(int[] nums) {
        int[]dp=new int[nums.length];
        dp[0]=1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            if(dp[i]==0) dp[i]=1;
        }
        int max=0;
        for(int i=0;i<dp.length;i++){
            max=Math.max(dp[i],max);
        }
        return max;
    }
}
//121334