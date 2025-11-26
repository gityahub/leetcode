package hot100;

import java.util.*;

public class Issue763_partitionLabels {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
    public static List<Integer> partitionLabels(String s) {
        Map<Character,List<Integer>> map=new HashMap<>();
        char []st=s.toCharArray();
        for(int i=0;i<st.length;i++){
            List<Integer> list;
            if(!map.containsKey(st[i])){
                list = new ArrayList<>();
                list.add(i);
            }
            else {
                list = map.get(st[i]);
                list.remove(list.size()-1);
            }
            list.add(i);
            map.put(st[i],list);
        }
        List<List<Integer>> temp = new ArrayList<>(map.values());
        temp.sort((a, b) -> a.get(0) - b.get(0));
        List<List<Integer>> res = new ArrayList<>();
        for (List<Integer> interval : temp) {
            if (res.isEmpty() || interval.get(0) > res.get(res.size() - 1).get(1)) {
                res.add(new ArrayList<>(interval));
            } else {
                res.get(res.size() - 1).set(1,
                        Math.max(res.get(res.size() - 1).get(1), interval.get(1)));
            }
        }
        List<Integer> fi=new ArrayList<>();
        for(List<Integer> list:res){
            fi.add(list.get(1)-list.get(0)+1);
        }
        return fi;
    }
}
