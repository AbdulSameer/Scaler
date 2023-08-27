public class Bulbs {
    public static int solve(int[] A){
        int n = A.length;
        int ans=0,state=0;
        for(int i=0;i<n;i++){
            if(A[i]==state){
             ans++;
             state = 1-state;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] A={0,1,1,1};
        System.out.println(solve(A));
    }
}
