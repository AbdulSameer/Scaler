import java.util.Arrays;

public class RangeSumQueryII {
    public static int[] solve(int[] A, int[][] B){
        int[] ans = new int[B.length];
        System.out.println(B.length);
        for(int i = 0; i < B.length; i++){
            int sum = 0;
            for(int j = B[i][0]; j <= B[i][1]; j++){
                sum += A[j];
            }
            ans[i] = sum;
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] matrix = { {0,3}, {1,2} };
        int[] A={1,2,3,4,5};
        int[] result =solve(A,matrix);
        System.out.println(Arrays.toString(result));
    }
}
