public class SpiralOrderMatrix {
    public static int[][] solve(int A){
        int[][] mat = new int[A][A];
        int row=0;
        int col=0;
        int element=1;
        int n=A;
        while(n>1) {
            for (int i = 1; i < n; i++) {
                mat[row][col] = element++;
                col++;
            }
            for (int i = 1; i < n; i++) {
                mat[row][col] = element++;
                row++;
            }
            for (int i = 1; i < n; i++) {
                mat[row][col] = element++;
                col--;
            }
            for (int i = 1; i < n; i++) {
                mat[row][col] = element++;
                row--;
            }
            row++;
            col++;
            n = n - 2;
        }
        if(n==1){
            mat[row][col]=element;
        }
        return mat;
    }
    public static void main(String[] args){
        int A=5;
        int[][] result = solve(A);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
