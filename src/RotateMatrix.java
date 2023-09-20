import java.util.Arrays;

public class RotateMatrix {
public static int[][] solve(int[][] A){
    int row = A.length;
    for(int i=0;i<row;i++){
        for(int j=i+1;j<row;j++){
            int temp = A[i][j];
            A[i][j]=A[j][i];
            A[j][i]=temp;
        }
    }
    for(int i=0;i<row;i++){
        int left=0, right=row-1;
        while(left<right){
            int temp = A[i][left];
            A[i][left]=A[i][right];
            A[i][right]=temp;
            left++;
            right--;
        }
    }
    return A;
}
    public static void main(String[] args){
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = solve(A);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
