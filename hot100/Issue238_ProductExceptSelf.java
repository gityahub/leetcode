package hot100;

public class Issue238_ProductExceptSelf {
    public static void main(String[] args) {
        productExceptSelf(new int[]{1,2,3,4,5});
    }

    public static int[] productExceptSelf(int[] nums) {
        int [] pre=new int[nums.length];
        int [] bre=new int[nums.length];
        int [] res=new int[nums.length];
        int len =nums.length;
        pre[0]=nums[0];
        bre[len-1]=nums[len-1];
        for(int i=1;i<len;i++){
            pre[i]=pre[i-1]*nums[i];
        }
        for(int i=len-2;i>-1;i--){
            bre[i]=bre[i+1]*nums[i];
        }
        for(int i=1;i<len-1;i++){
            res[i]=pre[i-1]*bre[i+1];
        }
        res[0]=bre[1];
        res[len-1]=pre[len-2];
        return res;
    }
}
