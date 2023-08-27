import java.util.Arrays;

public class SubArrayInGivenRange {
    public static int[] solve(int[] A,int B, int C){
        int[] arr = new int[C-B+1];
        for(int i=0;i<C-B+1;i++){
            arr[i]=A[B+i];
        }
        return arr;
    }
    public static void main(String args[]){
        int[] A={4,3,2,6};
        int B=1,C=3;
        int[] result = solve(A,B,C);
        System.out.println(Arrays.toString(result));
    }
}
