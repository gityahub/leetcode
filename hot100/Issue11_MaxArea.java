package hot100;

public class Issue11_MaxArea {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,3,2,5,25,24,5}));
    }


    public static int maxArea(int[] height) {
        int max = 0;
        for(int j=0;j<height.length;j++){
            if(max>((height.length-j)*height[j])) continue;
            for (int i = j+1; i < height.length; i++) {
                if(Math.min(height[j], height[i])*(i-j) >max){
                    max = Math.min(height[j], height[i])*(i-j);
                }
            }
        }

        return max;
    }

}
