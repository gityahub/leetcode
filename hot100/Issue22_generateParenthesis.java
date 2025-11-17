package hot100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Issue22_generateParenthesis {
    public static void main(String[] args) {
    }
    List<String> res=new ArrayList<>();
    StringBuffer path=new StringBuffer();
    int leftNums=0;int rightNums=0;
    public List<String> generateParenthesis(int n) {
        for(int i=0;i<n;i++){
            path.append(")");
        }
        backtracing(n,0);
        return res;
    }
    public void backtracing(int n,int startIndex){
        if(leftNums>n) return;
        if(leftNums==n){
            res.add(String.valueOf(path));
            return;
        }
        if(path.charAt(startIndex)==')'&&leftNums==0) {
            return;
        }
        for(int i=startIndex;i<path.length();i++){
            path.insert(i,"(");
            leftNums++;
            backtracing(n,i+1);
            path.deleteCharAt(i);
            leftNums--;
        }
    }
}
