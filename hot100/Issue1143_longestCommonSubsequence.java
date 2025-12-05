package hot100;

public class Issue1143_longestCommonSubsequence {
    public static void main(String[] args) {
        longestCommonSubsequence("oxcpqrsvwf","shmtulqrypy");
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        char[]t1=text1.toCharArray();
        char[]t2=text2.toCharArray();
        int index=0;
        for(int i=0;i<t1.length;i++){
            for(int j=index;j<t2.length;j++){
                if(t1[i]==t2[j]){
                    sb1.append(t1[i]);
                    index=j+1;
                    break;
                }
            }
        }
        index=0;
        for(int i=0;i<t2.length;i++){
            for(int j=index;j<t1.length;j++){
                if(t2[i]==t1[j]){
                    sb2.append(t2[i]);
                    index=j+1;
                    break;
                }
            }
        }
        return Math.max(sb1.length(),sb2.length());
    }
}
