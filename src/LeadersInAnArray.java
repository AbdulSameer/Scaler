import java.util.Arrays;

public class LeadersInAnArray {
    public static int[] solve(int[] A){
        int n = A.length;
        int max = A[n-1];
        int count=1;
        for(int i=n-2;i>=0;i--){
            if(A[i]>max){
                max=A[i];
                count++;
            }
        }
        int[] ans = new int[count];
        max = A[n-1];
        ans[0]=max;
        int j=1;
        for(int i=n-2;i>=0;i--){
            if(A[i]>max){
                max=A[i];
                ans[j]=max;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] A ={18,16, 17, 4, 3, 5, 2};
        int[] result = solve(A);
        System.out.println(Arrays.toString(result));
    }
}
