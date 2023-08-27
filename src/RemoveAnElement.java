import java.util.Arrays;

public class RemoveAnElement {
    public static int[] solve(int[] A,int val){
        int n = A.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(val!=A[i]){
                A[ans]=A[i];
                ans++;
            }
        }
        return A;
    }
    public static void main(String[] args){
        int[] A ={1,4,5,7,9,10};
        int val=5;
        int[] result = solve(A,val);
        System.out.println(Arrays.toString(result));

    }
}
