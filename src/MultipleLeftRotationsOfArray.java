public class MultipleLeftRotationsOfArray {
    public static int[][] solve(int[] A, int[] B){
        int n = A.length;
        int m = B.length;
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=A[(B[i]+j)%n];
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] A={1, 2, 3, 4, 5};
        int[] B={2, 3};
        int[][] result = solve(A,B);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
