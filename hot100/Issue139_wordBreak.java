package hot100;

import java.util.*;

public class Issue139_wordBreak {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(new String[]{"cats","dog","sand","and","cat","an"}));
        System.out.println(wordBreak("catsandogcat",list));
    }
        public static boolean wordBreak(String s, List<String> wordDict) {
            Set<String> wordDictSet = new HashSet(wordDict);
            boolean[] dp = new boolean[s.length() + 1];
            dp[0] = true;
            for (int i = 1; i <= s.length(); i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            return dp[s.length()];
    }
}
