package hot100;

public class Issue55_canJump {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{1,0,1,0}));
    }
    public static boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i]+i;
        }
        for(int j=0;j<nums.length;j++){
            if(j>0&&max<j) return false;
            max=Math.max(nums[j],max);
            if(nums[j]>=nums.length-1) return true;
        }
        return false;
    }
}
