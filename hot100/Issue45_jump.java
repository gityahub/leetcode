package hot100;

public class Issue45_jump {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{1,2,3}));
    }
    public static int jump(int[] nums) {
        if(nums.length==1) return 0;
        int res=0;int i=0;
        while(i<=nums.length-1){
            if(nums[i]+i>=nums.length-1) return res+1;
            int sum=0;int maxIndex=0;
            for(int j=i;j<i+nums[i]+1;j++){
                if(nums[j]+j>sum){
                    sum=nums[j]+j;
                    maxIndex=j;
                }
            }
            i=maxIndex;
            res++;
        }
        return res;
    }
}
