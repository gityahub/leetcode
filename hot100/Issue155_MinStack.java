package hot100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Issue155_MinStack {
    Deque<Integer> stack=new ArrayDeque<>();
    Deque<Integer> stack_min=new ArrayDeque<>(){};
    public void push(int val) {
        stack.push(val);
        if(stack_min.isEmpty()) stack_min.push(val);
        else if(stack_min.peek()>=val){
            stack_min.push(val);
        }
    }

    public void pop() {
        int temp=stack.pop();
        if(stack_min.peek()==temp) stack_min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack_min.peek();
    }

}

