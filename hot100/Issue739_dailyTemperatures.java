package hot100;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Issue739_dailyTemperatures {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));;
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack=new ArrayDeque<>();
        Deque<Integer> index=new ArrayDeque<>();
        int[]res=new int[temperatures.length];
        stack.push(temperatures[0]);
        index.push(0);
        for(int i=1;i<temperatures.length;i++){
            if (temperatures[i] > stack.peek()) {
                while (!stack.isEmpty()) {
                    if (stack.peek() < temperatures[i]) {
                        stack.pop();
                        int sub=index.pop();
                        res[sub]=i-sub;
                    } else break;
                }
            }
            stack.push(temperatures[i]);
            index.push(i);
        }
        return res;
    }
}
