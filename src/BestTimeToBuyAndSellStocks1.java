public class BestTimeToBuyAndSellStocks1 {

    public static int solve(int[] A){
        int n = A.length;
        int min=A[0];
        int ans=0;
        for(int i=0;i<n-1;i++){
            if(A[i]<min){
                min=A[i];
            }
            int max=A[i+1]-min;
            ans=Math.max(max,ans);
        }
        return ans;
    }

    public static void main(String args[]){
        int[] A={5, 4, 1, 2, 4};
        int result=solve(A);
        System.out.print(result);
    }
}
