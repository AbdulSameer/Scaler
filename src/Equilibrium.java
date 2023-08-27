public class Equilibrium {
    public static int solve(int A[]){
        int n = A.length;
        int[] pSum = new int[n];
        int ans=-1;
        pSum[0]=A[0];
        for(int i=1;i<n;i++){
            pSum[i]=pSum[i-1]+A[i];
        }
        for(int i=0;i<n;i++){
            int leftSum=0, rightSum=0;
            if(i==0){
                leftSum = 0;
            }
            else{
                rightSum = pSum[i-1];
            }
            if(i==n-1){
                rightSum = 0;
            }
            else{
                leftSum =  pSum[n-1]-pSum[i];
            }
            if(leftSum==rightSum){
                ans=i;
                break;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] A= {-7,1,5,2,-4,3,0};
        int result=solve(A);
        System.out.println(result);
    }
}
