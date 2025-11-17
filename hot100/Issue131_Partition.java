package hot100;

import java.util.ArrayList;
import java.util.List;

public class Issue131_Partition {
    List<List<String>> res=new ArrayList<>();
    List<String> res1=new ArrayList<>();
    public static void main(String[] args) {

    }
    public List<List<String>> partition(String s) {
        backtracing(s,0);
        return res;
    }
    public void backtracing(String s,int startIndex){
        if(startIndex==s.length()){
            res.add(new ArrayList<>(res1));
            return;
        }
        for(int i=startIndex;i<s.length();i++){
            if(isPalindrome(s.substring(startIndex,i+1))){
                res1.add(s.substring(startIndex,i+1));
            }
            else continue;
            backtracing(s,i+1);
            res1.remove(res1.size()-1);
        }
    }
    public boolean isPalindrome(String s){
        if(s.isEmpty()) return false;
        int len=s.length();
        int mid=len/2;
        for(int i=0;i<mid;i++){
            if(s.charAt(i)!=s.charAt(len-i-1))
                return false;
        }
        return true;
    }
}
