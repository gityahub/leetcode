package hot100;

import java.util.ArrayDeque;
import java.util.Deque;

public class Issue200_NumIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','0','1','0','0','1'},
        };

        System.out.println(numIslands(grid));
        for (char[] row : grid) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static int numIslands(char[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    numIslands2(grid,i,j);
                    res++;
                }
            }
        }

        return res;
    }

    public static void numIslands2(char[][] grid,int i_index,int j_index) {
        if(i_index<0||j_index<0||i_index>grid.length-1||j_index>grid[0].length-1){
            return ;
        }
        if(grid[i_index][j_index] == '1'){
            grid[i_index][j_index]='9';
            numIslands2(grid,i_index-1,j_index);
            numIslands2(grid,i_index+1,j_index);
            numIslands2(grid,i_index,j_index-1);
            numIslands2(grid,i_index,j_index+1);
        }
    }
}
