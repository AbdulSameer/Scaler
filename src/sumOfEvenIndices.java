import java.util.Arrays;

public class sumOfEvenIndices {

    public static int[] solve(int[] A, int[][] B){
        int n = A.length;
        int m=B.length;
        int[] pSum = new int[n];
        pSum[0]=A[0];
        for(int i=1;i<n;i++){
            if(i%2==0){
                pSum[i]=pSum[i-1]+A[i];
            }
            else{
                pSum[i]=pSum[i-1];
            }
        }
        int[] ans = new int[m];
        for(int i=0;i<m;i++){
            int l=B[i][0];
            int r=B[i][1];
            if(l==0){
                ans[i]=pSum[r];
            }
            else{
                ans[i]=pSum[r]-pSum[l-1];
            }
        }
        return ans;

    }

    public static void main(String[] args){
        int[] A= {1,2,3,4,5};
        int[][] B= {{0,2},{1,4}};
        int[] result = solve(A,B);
        System.out.println(Arrays.toString(result));

    }
}
