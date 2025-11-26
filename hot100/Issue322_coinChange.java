package hot100;

public class Issue322_coinChange {
    public static void main(String[] args) {
        coinChange(new int[]{186,419,83,408},6249);
    }
    public static int coinChange(int[] coins, int amount) {
        int []f=new int[amount+1];
        for(int i=1;i<f.length;i++){
            int min=Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin >= 0) {
                    min = Math.min(min, f[i - coin]);
                }
            }
            if(min!=Integer.MAX_VALUE){
                f[i]=min+1;
            }
            else f[i]=min;
        }
        return f[amount]!=Integer.MAX_VALUE?f[amount]:-1;
    }
}
