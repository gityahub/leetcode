package hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Issue438_FindAnagrams {
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int valid = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (map.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(map.get(c))) {
                    valid++;
                }
            }
            while (right - left >= p.length()) {
                if (valid == map.size()) {
                    ans.add(left);
                }
                char d = s.charAt(left);
                left++;
                if (map.containsKey(d)) {
                    if (window.get(d).equals(map.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        return ans;
    }
}


//class Solution {
//    public List<Integer> findAnagrams(String s, String p) {
//        int sLen = s.length(), pLen = p.length();
//
//        if (sLen < pLen) {
//            return new ArrayList<Integer>();
//        }
//
//        List<Integer> ans = new ArrayList<Integer>();
//        int[] sCount = new int[26];
//        int[] pCount = new int[26];
//        for (int i = 0; i < pLen; ++i) {
//            ++sCount[s.charAt(i) - 'a'];
//            ++pCount[p.charAt(i) - 'a'];
//        }
//
//        if (Arrays.equals(sCount, pCount)) {
//            ans.add(0);
//        }
//
//        for (int i = 0; i < sLen - pLen; ++i) {
//            --sCount[s.charAt(i) - 'a'];
//            ++sCount[s.charAt(i + pLen) - 'a'];
//
//            if (Arrays.equals(sCount, pCount)) {
//                ans.add(i + 1);
//            }
//        }
//
//        return ans;
//    }
//}
//
//作者：力扣官方题解
//链接：https://leetcode.cn/problems/find-all-anagrams-in-a-string/solutions/1123971/zhao-dao-zi-fu-chuan-zhong-suo-you-zi-mu-xzin/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


