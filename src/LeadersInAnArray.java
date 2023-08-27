public class LeadersInAnArray {
    public static int solve(int[] A){
        int n = A.length;
        int max=0;
        int ans=1;
        for(int i=n-2;i>=0;i--){
            if(A[i]>max){
                ans++;
                max=A[i];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] A ={18,16, 17, 4, 3, 5, 2};
        int result = solve(A);
        System.out.println(result);
    }
}
