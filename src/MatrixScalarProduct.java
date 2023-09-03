public class MatrixScalarProduct {
public static int[][] solve(int[][] A, int B){
    int row = A.length;
    int col = A[0].length;
    int c[][] = new int[row][col];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            c[i][j] = A[i][j]*B;
        }
    }
    return c;
}
    public static void main(String[] args){
        int[][] A = {{1,2},{3,4}};
        int B = 2;
        int[][] result = solve(A,B);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
