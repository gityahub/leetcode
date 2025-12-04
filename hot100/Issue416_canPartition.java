package hot100;

import java.util.Arrays;

public class Issue416_canPartition {
    public static void main(String[] args) {
        canPartition(new int[]{3,3,3,4,5});
    }
    public static boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
        int []vis=new int[nums.length];
        int sum1=0,sum2=0;
        for (int i=0;i<nums.length;i++) {
            if (sum1 <= sum2) {
                sum1 += nums[i];
                vis[i]=1;
            }
            else {
                sum2 += nums[i];
                vis[i]=2;
            }
        }
        if(sum1==sum2) return true;
        int a=sum1-sum2;
        for(int i=0;i<nums.length;i++){
            if(i*2==a&&((a>0&&vis[i]==2)||(a<0&&vis[i]==1))) return true;
        }
        return false;
    }
}
