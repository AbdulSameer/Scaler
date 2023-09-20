package practice;

import java.util.Arrays;

public class EvenIndices {
    public static int[] solve(int[] A){
        int n = A.length;
        int pSum[] =  new int[n];
        pSum[0] = A[0];
        for(int i = 1 ; i < n; i++){
            if(i%2 == 0){
                pSum[i] = pSum[i-1] + A[i];
            }
            else{
                pSum[i] = pSum[i-1];
            }
        }
        return pSum;
    }
    public static void main(String args[]){
        int[] A={1,2,3,4,5};
        int[] result = solve(A);
        System.out.println(Arrays.toString(result));
    }
}
