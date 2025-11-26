package hot100;

import java.util.ArrayList;
import java.util.List;

public class Issue118_generate {
    public static void main(String[] args) {
        System.out.println(generate(3));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i) list.add(1);
                else list.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            res.add(list);
        }
        return res;
    }
}
