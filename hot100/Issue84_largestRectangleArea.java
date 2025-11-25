package hot100;

import java.util.ArrayDeque;
import java.util.Deque;

public class Issue84_largestRectangleArea {
    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
    public static int largestRectangleArea(int[] heights) {
        int max=0;
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(0);
        for(int i=1;i<heights.length;i++){
            if(heights[i]>=heights[stack.peek()]){
                stack.push(i);
            }
            else {
                int count=0;
                while (!stack.isEmpty()&&heights[stack.peek()]>=heights[i]){
                    count++;
                    int height=heights[stack.pop()];
                    max=Math.max(height*count,max);
                }
                for(int j=0;j<count+1;j++){
                    stack.push(i);
                }
            }
        }
        int count=0;
        while (!stack.isEmpty()){
            count++;
            int height=heights[stack.pop()];
            max=Math.max(height*count,max);
        }
        return max;
    }
}
