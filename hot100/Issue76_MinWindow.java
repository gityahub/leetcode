package hot100;

public class Issue76_MinWindow {
    public static void main(String[] args) {
        System.out.println(minWindow("bdab","ab"));
    }

    public static String minWindow(String s, String t) {
        int []tempNums=new int[58];
        for(int j=0;j<t.length();j++){
            tempNums[t.charAt(j)-'A']++;
        }
        String ans="";
        int len=100000;
        StringBuffer sb=new StringBuffer();
        int right=0;
        int judge=0;
        for(int i=0;i<s.length();i++){
            while (tempNums[s.charAt(i)-'A']>0){
                tempNums[s.charAt(i)-'A']--;
                judge=1;
                for(int k=0;k<tempNums.length;k++){
                    if(tempNums[k]>0){
                        break;
                    }
                    else if(sb.length()<len){
                        ans=sb.toString();
                    }
                }
            }
            if(judge==1){
                sb.append(s.charAt(i));
            }

        }
        return ans;
    }
}



//class Solution {
//    Map<Character, Integer> ori = new HashMap<Character, Integer>();
//    Map<Character, Integer> cnt = new HashMap<Character, Integer>();
//
//    public String minWindow(String s, String t) {
//        int tLen = t.length();
//        for (int i = 0; i < tLen; i++) {
//            char c = t.charAt(i);
//            ori.put(c, ori.getOrDefault(c, 0) + 1);
//        }
//        int l = 0, r = -1;
//        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
//        int sLen = s.length();
//        while (r < sLen) {
//            ++r;
//            if (r < sLen && ori.containsKey(s.charAt(r))) {
//                cnt.put(s.charAt(r), cnt.getOrDefault(s.charAt(r), 0) + 1);
//            }
//            while (check() && l <= r) {
//                if (r - l + 1 < len) {
//                    len = r - l + 1;
//                    ansL = l;
//                    ansR = l + len;
//                }
//                if (ori.containsKey(s.charAt(l))) {
//                    cnt.put(s.charAt(l), cnt.getOrDefault(s.charAt(l), 0) - 1);
//                }
//                ++l;
//            }
//        }
//        return ansL == -1 ? "" : s.substring(ansL, ansR);
//    }
//
//    public boolean check() {
//        Iterator iter = ori.entrySet().iterator();
//        while (iter.hasNext()) {
//            Map.Entry entry = (Map.Entry) iter.next();
//            Character key = (Character) entry.getKey();
//            Integer val = (Integer) entry.getValue();
//            if (cnt.getOrDefault(key, 0) < val) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
//
//作者：力扣官方题解
//链接：https://leetcode.cn/problems/minimum-window-substring/solutions/257359/zui-xiao-fu-gai-zi-chuan-by-leetcode-solution/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。