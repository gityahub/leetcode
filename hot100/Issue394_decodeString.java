package hot100;

import java.util.ArrayDeque;
import java.util.Deque;

public class Issue394_decodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("100[leetcode]"));
    }
    public static String decodeString(String s) {
        Deque<String> stack=new ArrayDeque<>();
        char [] temp=s.toCharArray();
        StringBuffer count=new StringBuffer();
        for(char c:temp){
            if(c<=57&&c>=48){
                count.append(c);
            }
            else if(c=='[') {
                stack.push(count.toString());
                count.setLength(0);
                stack.push(c+"");
            }
            else if(c==']'){
                StringBuffer sb=new StringBuffer();
                while(!stack.isEmpty()){
                    if(stack.peek().equals("[")) {
                        stack.pop();
                        int num=Integer.parseInt(stack.pop());
                        StringBuffer temp1=new StringBuffer();
                        for(int i=0;i<num;i++){
                            temp1.append(sb);
                        }
                        stack.push(temp1.toString());
                        break;
                    }
                    else sb.insert(0,stack.pop());
                }
            }
            else stack.push(c+"");
        }
        StringBuffer sb=new StringBuffer();
        while (!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }
}
