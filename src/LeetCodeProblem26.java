import java.util.Arrays;

public class  LeetCodeProblem26 {

    public static int solve(int[] A){
        int n = A.length;

        int i=0;
        for(int j=1;j<n;j++){
            if(A[i]!=A[j]){
                i++;
                A[i]=A[j];
            }
        }
        return i+1;
    }

    public static void main(String args[]){
        int[] A={1,1,2,2,3,4,4,4,5};
        int result = solve(A);
        System.out.println(result);
        for(int i=0;i<result;i++){
            System.out.print(A[i]+"");
        }
    }
}
