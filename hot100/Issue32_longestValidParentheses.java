package hot100;

import java.util.ArrayDeque;
import java.util.Deque;

public class Issue32_longestValidParentheses {
    public static void main(String[] args) {
        longestValidParentheses("()(()");
    }
    public static int longestValidParentheses(String s) {
        if(s.isEmpty()) return 0;
        char []temp=s.toCharArray();
        int max=0;int []dp=new int[temp.length];
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<temp.length;i++){

        }
        return dp[s.length()-1];
    }
}
