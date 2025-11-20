package hot100;

import java.util.ArrayList;
import java.util.List;

public class Issue51_solveNQueens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(3));
    }
    static List<List<Integer>> res=new ArrayList<>();
    static List<Integer> path=new ArrayList<>();
    public static List<List<Integer>> solveNQueens(int n) {
        int [][]can=new int[n][n];
        backtracing(n,0,can);
        return res;
    }
    public static void backtracing(int n, int startIndex, int[][] can){
        if(startIndex==n){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<n;i++){
            for(int j=0;j<n;j++){
                if(can[i][j]==0){
                    int [][]temp=new int[n][n];
                    for(int a=0;a<n;a++){
                        for(int b=0;b<n;b++){
                            temp[a][b]=can[a][b];
                        }
                    }
                    path.add(j);
                    for(int k=0;k<n;k++){
                        can[i][k]=1;
                    }
                    for(int k=0;k<n;k++){
                        can[k][j]=1;
                    }
                    backtracing(n,i+1,can);
                    path.remove(path.size()-1);
                    for(int a=0;a<n;a++){
                        for(int b=0;b<n;b++){
                            can[a][b]=temp[a][b];
                        }
                    }
                }
            }
        }
    }
}


//error