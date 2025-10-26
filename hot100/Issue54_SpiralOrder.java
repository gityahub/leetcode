package hot100;

import java.util.ArrayList;
import java.util.List;

public class Issue54_SpiralOrder {
    public static void main(String[] args) {
        System.out.println(spiralOrder( new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));;

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int k=0;
        int index=0;
        int row=matrix.length;
        int col=matrix[0].length;
        int nums=row*col;
        int i=0;
        int j=0;
        int top = 0, bottom = row - 1;
        int left = 0, right = col - 1;
        while(index<nums){
            list.add(matrix[i][j]);
            switch (k){
                case 0:
                    if(j<right) j++;
                    else {k=1;top++;i++;}
                    break;
                case 1:
                    if(i<bottom) i++;
                    else {k=2;right--;j--;}
                    break;
                case 2:
                    if(j>left) j--;
                    else {k=3;bottom--;i--;}
                    break;
                case 3:
                    if(i>top) i--;
                    else {k=0;left++;j++;}
                    break;
            }
            index++;
        }
        return  list;
    }
}
