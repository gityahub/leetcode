package hot100;

import java.util.*;

public class Issue49_AZGroup {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat","c","c"}));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        String[] temp = new String[strs.length];
        List<List<String>> ans = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        int index = 0;
        for (int i = 0; i < strs.length; i++) {
            char [] a=strs[i].toCharArray();
            Arrays.sort(a);
            temp[i]=new String(a);
            if(strs[i].isEmpty()){
                index++;
                continue;
            }
            set.add(String.valueOf(a));

        }
        List<String> temp1 = new ArrayList<>();
        if(index!=0){
            for (int i = 0; i < index; i++) {
                temp1.add("");
            }
            ans.add(temp1);
        }

        for (String key : set) {
            List<String> temp2 = new ArrayList<>();
            for(int i=0;i<temp.length;i++) {
                if(temp[i].equals(key)) {
                    temp2.add(strs[i]);
                }
            }
            ans.add(temp2);
        }

        return ans;
    }
}


//class Solution {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String, List<String>> map = new HashMap<String, List<String>>();
//        for (String str : strs) {
//            char[] array = str.toCharArray();
//            Arrays.sort(array);
//            String key = new String(array);
//            List<String> list = map.getOrDefault(key, new ArrayList<String>());
//            list.add(str);
//            map.put(key, list);
//        }
//        return new ArrayList<List<String>>(map.values());
//    }
//}
//
//作者：力扣官方题解
//链接：https://leetcode.cn/problems/group-anagrams/solutions/520469/zi-mu-yi-wei-ci-fen-zu-by-leetcode-solut-gyoc/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。