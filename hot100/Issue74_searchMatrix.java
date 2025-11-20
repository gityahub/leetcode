package hot100;

public class Issue74_searchMatrix {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        return search(matrix,target,0,m*n-1);
    }
    public boolean search(int [][]matrix,int target,int start,int end){
        if(start>end) return false;
        int mid=(start+end)/2;
        int m=mid/matrix[0].length;
        int n=mid%matrix[0].length;
        if(matrix[m][n]==target) return true;
        if(matrix[m][n]<target) return search(matrix,target,mid+1,end);
        return search(matrix,target,start,mid-1);
    }
}
