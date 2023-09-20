import java.util.Arrays;

public class SuffixSum {
    public static int[] solve(int[] A){
        int n = A.length;
        int[] ssum=new int[n];
        ssum[n-1] = A[n-1];
        for(int i=n-2;i>=0;i--){
            ssum[i] = ssum[i+1]+A[i];
        }
        return ssum;
    }
    public static void main(String[] args){
        int[] A= {1,2,3,4,5};
        int[] result = solve(A);
        System.out.println(Arrays.toString(result));
    }
}
