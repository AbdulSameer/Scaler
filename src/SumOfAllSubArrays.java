public class SumOfAllSubArrays {
    public static int solve(int[] A){
        //brute force method
        /*int n = A.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+A[k];
                }
            }
        }
        return sum;*/
        int ans = 0;
        int n = A.length;
        for (int i = 0; i < n; i++)
            ans += A[i] * (i + 1) * (n - i);
        return ans ;
    }
    public static void main(String args[]){
        int[] A ={1, 2, 3};
        int result=solve(A);
        System.out.println(result);
    }
}
