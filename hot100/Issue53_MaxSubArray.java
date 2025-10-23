package hot100;

public class Issue53_MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums) {
        int n=nums.length;
        int []pre=new int[n+1];
        pre[0]=0;
        for(int i=1;i<n+1;i++){
            pre[i]=pre[i-1]+nums[i-1];
        }


        int minPre = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, pre[i] - minPre);
            minPre = Math.min(minPre, pre[i]);
        }
        return  max;
    }
}
