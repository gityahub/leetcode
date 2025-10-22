package hot100;

import java.util.Arrays;

public class Issue239_MaxSlidingWindow {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{9,10,9,-7,-4,-8,2,-6}, 5)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k==1 ) return nums;

        int []ans=new int[nums.length-k+1];
        int ansIndex=0;
        int len = nums.length;
        int max=0;int maxIndex=0;
        for(int i=0;i<k;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }
        ans[ansIndex++]=max;
        for (int i = 0; i < len-k; i++) {
            if(nums[i+k]>=max){
                max=nums[i+k];
                maxIndex=i+k;
            }
            if (maxIndex < i + 1) {
                max = nums[i + 1];
                maxIndex = i + 1;
                for (int j = i + 1; j <= i + k; j++) {
                    if (nums[j] > max) {
                        max = nums[j];
                        maxIndex = j;
                    }
                }
            }

            ans[ansIndex++]=max;
        }
        return ans;
    }
}
