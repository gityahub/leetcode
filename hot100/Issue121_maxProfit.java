package hot100;

import java.util.Arrays;

public class Issue121_maxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
    public static int maxProfit(int[] prices) {
        int left=0,right=0;;
        int res=0;
        for(right=0;right<prices.length;right++){
            if(prices[right]<prices[left]) left=right;
            res=Math.max(res,prices[right]-prices[left]);
        }
        return res;
    }
}
