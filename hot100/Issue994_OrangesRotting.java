package hot100;

import java.util.ArrayDeque;
import java.util.Deque;

public class Issue994_OrangesRotting {
    public static void main(String[] args) {
        int[][] grid = {
                {0},
        };
        orangesRotting(grid);
        for (int[] row : grid) {
            for (int v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static int orangesRotting(int[][] grid) {
        tag: for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    break tag;
                }
                if(i==grid.length-1&&j==grid[0].length-1){
                    return 0;
                }
            }
        }
        Deque<Integer[]> deque = new ArrayDeque<>();
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    deque.offer(new Integer[]{i,j});
                }
            }
        }
        int ans=0;
        while(!deque.isEmpty()){
            int size = deque.size();
            ans++;
            for(int i=0;i<size;i++){
                Integer[] integers = deque.poll();
                if (integers[0]-1>=0 && grid[integers[0] - 1][integers[1]] == 1) {
                    grid[integers[0] - 1][integers[1]] = 2;
                    deque.offer(new Integer[]{integers[0] - 1, integers[1]});
                }
                if(integers[0]+1<m&&grid[integers[0]+1][integers[1]]==1){
                    grid[integers[0]+1][integers[1]] = 2;
                    deque.offer(new Integer[]{integers[0]+1,integers[1]});
                }
                if(integers[1]-1>=0&&grid[integers[0]][integers[1]-1]==1){
                    grid[integers[0]][integers[1]-1] = 2;
                    deque.offer(new Integer[]{integers[0],integers[1]-1});
                }
                if(integers[1]+1<n&&grid[integers[0]][integers[1]+1]==1){
                    grid[integers[0]][integers[1]+1] = 2;
                    deque.offer(new Integer[]{integers[0],integers[1]+1});
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    ans=0;
                    break;
                }
            }
        }
        return ans-1;
    }
}
