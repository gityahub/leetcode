package hot100;

public class Issue42_HoldRain {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    public static int trap(int[] height) {
        int max=0;int max_num=0;
        for (int i = 0; i <= height.length - 1; i++) {
            if(height[i]>=max){
                max=height[i];
                max_num=i;
            }
        }
        int ans = 0;int i=0;
        while(i<max_num){
            if(height[i+1]<height[i]){
                int temp=0;
                for (int j = i+1; j <=max_num; j++) {
                    temp+=height[j];
                    if(height[j]>=height[i]){
                        ans+=height[i]*(j-i-1)-temp+height[j];
                        i=j-1;
                        break;
                    }
                }
            }
            i++;
        }
        i= height.length-1;
        while(i>max_num){
            if(height[i-1]<height[i]){
                int temp=0;
                for (int j = i-1; j >=max_num; j--) {
                    temp+=height[j];
                    if(height[j]>=height[i]){
                        ans+=height[i]*(i-j-1)-temp+height[j];
                        i=j+1;
                        break;
                    }
                }
            }
            i--;
        }

        return ans;
    }
}


