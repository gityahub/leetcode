package hot100;

public class Issue198_rob {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{10,7,9,10}));
    }
    public static int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        if(nums.length==3) return Math.max(nums[0]+nums[2],nums[1]);
        int[] temp =new int[nums.length];
        temp[0]=nums[0];temp[1]=nums[1];temp[2]=nums[2]+nums[0];
        for(int i=3;i<nums.length;i++){
            temp[i]=nums[i]+Math.max(temp[i-2],temp[i-3]);
        }
        return Math.max(temp[temp.length-1],temp[temp.length-2]);
    }
}
