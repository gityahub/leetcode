package hot100;

import java.util.Arrays;
import java.util.Comparator;

public class Issue56_Merge {
    public static void main(String[] args) {
        for (int[] row : merge(new int[][]{{1,3},{2,6},{8,10},{15,18}})) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] res = new int[intervals.length][2];
        int index = 0;
        int left=intervals[0][0];int right=intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]<=right){
                left=Math.min(left,intervals[i][0]);
                right=Math.max(right,intervals[i][1]);
            }
            else {
                res[index][0]=left;
                res[index][1]=right;
                index++;
                left=intervals[i][0];right=intervals[i][1];
            }
        }
        res[index][0] = left;
        res[index][1] = right;
        index++;

        return  Arrays.copyOf(res, index);
    }
}
