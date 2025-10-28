package hot100;

public class Issue240_SearchMatrix {
    public static void main(String[] args) {
        searchMatrix(new int[][]{{-1,3}},3);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = 0;

        while (row < m && col < n) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) {
                if (col + 1 < n && matrix[row][col + 1] <= target) col++;
                else row++;
            }
            else {
                if (col - 1 >= 0 && matrix[row][col - 1] >= target) col--;
                else if (row - 1 >= 0) row--;
                else break;
            }
        }
        return false;
    }

}
