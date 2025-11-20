package hot100;

import java.util.ArrayList;
import java.util.List;

public class Issue93_RestoreIpAddresses {
    public static void main(String[] args) {

    }
    List<String> res=new ArrayList<>();
    StringBuffer path=new StringBuffer();
    int sum=0;
    public List<String> restoreIpAddresses(String s) {
        backtracing(s,0);
        return res;
    }
    public void backtracing(String s,int startIndex){
        if(startIndex==s.length()&&sum==4){
            String a= path.substring(0,path.length()-1);
            res.add(a);
        }
        for(int i=startIndex;i<s.length();i++){
            if(!isValid(s.substring(startIndex,i+1))) continue;
            path.append(s, startIndex, i+1);
            int len=i+1-startIndex;
            sum++;
            path.append(".");
            backtracing(s,i+1);
            path.deleteCharAt(path.length()-1);
            path.delete(path.length()-len,path.length());
            sum--;
        }
    }
    public boolean isValid(String s){
        if(s.isEmpty()) return false;
        if(s.length()>3) return false;
        if(s.equals("0")) return true;
        if(s.charAt(0)=='0') return false;
        int temp=Integer.parseInt(s);
        if(temp>0&&temp<=255) return true;
        return false;
    }
}
