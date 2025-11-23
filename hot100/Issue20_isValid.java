package hot100;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Issue20_isValid {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        char[]t=s.toCharArray();
        Deque<Character> stack = new LinkedList<>();
        for (char c : t) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            if (stack.isEmpty() && (c == '}' || c == ']' || c == ')')) return false;
            else {
                if (c == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else return false;
                }
                if (c == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else return false;
                }
                if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
