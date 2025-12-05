package hot100;

public class Issue5_longestPalindrome {
    public static void main(String[] args) {
        longestPalindrome("abbcccba");
    }
    public static String longestPalindrome(String s) {
        if(s.length()==1) return s;
        boolean [][]dp=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            dp[i][i]=true;
        }
        for (int i = 0; i < dp.length; i++) {
            for(int j=i+1;j<dp.length;j++){
                if(dp[i][j-1]&&s.charAt(j)!=s.charAt(j-1)){
                    dp[i][j]=false;
                    continue;
                }
                if(i-1>0&&j+1<dp.length&&dp[i-1][j+1]) {
                    dp[i][j]=dp[i-1][j+1];
                    continue;
                }
                dp[i][j]= isPalindrome(s.substring(i, j+1));
            }
        }
        int max=0;
        int i_index=0,j_index=0;
        for(int i=0;i<dp.length;i++){
            for(int j=i+1;j<dp.length;j++){
                if(dp[i][j] &&j-i>max) {
                    max=j-i;
                    i_index=i;
                    j_index=j;
                }
            }
        }
        return s.substring(i_index,j_index+1);
    }
    public static boolean isPalindrome(String a){
        char []temp= a.toCharArray();
        int n=temp.length;
        for(int i=0;i<n;i++){
            if(temp[i]!=temp[n-i-1]) return false;
        }
        return true;
    }
}
