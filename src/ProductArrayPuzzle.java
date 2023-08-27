import java.util.Arrays;

public class ProductArrayPuzzle {
    public static int[] solve(int[] A){
        int n = A.length;
        int prod=1;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            prod=prod*A[i];
        }
        for(int i=0;i<n;i++){
            ans[i]=prod/A[i];
        }
        return ans;
    }

    public static void main(String args[]){
        int[] A={1,2,3,4,5};
        int[] result=solve(A);
        System.out.println(Arrays.toString(result));

    }
}
