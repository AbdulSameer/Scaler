import java.util.Arrays;

public class SubArrayWithLeastAverage {
    public static int solve(int[] A, int B){
        int n = A.length;
        int[] arr = new int[n-B+1];
        int i=0;
        int ans=0;
        int div=B;
        while(i<n-B+1){
            int sum=0;
            float avg=0;
            for(int j=i;j<i+B;j++){
                sum+=A[j];
            }
            avg=(sum/div);
            arr[i]=(int)avg;
            i++;
            B++;
        }
        int min=Integer.MAX_VALUE;
        for(i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] A={3, 7, 90, 20, 10, 50, 40};
        int B=3;
        int result= solve(A,B);
        System.out.println(result);
    }
}
