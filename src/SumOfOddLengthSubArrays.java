public class SumOfOddLengthSubArrays {
    public static int solve(int[] A){
        int n = A.length;
        int sum=0;
        //brute force approach with TC(n^3)
        /*for(int i=0;i<n;i++){
            for(int j=i;j<n;j=j+2){
                for(int k=i;k<=j;k++){
                    sum = sum+A[k];
                }
            }
        }
        return sum;*/
        int[] psum = new int[n];
        psum[0] = A[0];
        for(int i=1;i<n;i++){
            psum[i]=psum[i-1]+A[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int len=j-i+1;
                if(len%2==1){
                    if(i>0)sum=sum+psum[j]-psum[i-1];
                    else sum=sum+psum[j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int[] A= {1,4,2,5,3};
        System.out.println(solve(A));
    }
}
