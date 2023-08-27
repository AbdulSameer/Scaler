public class PickFromBothSides {
    public static int solve(int[] A, int B) {
     /*   int n = A.length;
        int lhs = 0;
        int rhs = 0;
        for(int i=0;i<B;i++){
            A[i]=A[i]+lhs;
        }
        for(int i=n-1;i>n-B;i--){
            A[i]=A[i]+rhs;
        }
        return Math.max(lhs,rhs);
    }*/
        int n = A.length;
        int[] psum = new int[n];
        int[] ssum = new int[n+1];
        psum[0] = A[0];
        ssum[n-1] = A[n - 1];
        for(int i=1;i<n;i++){
            psum[i]=psum[i-1]+A[i];
        }
        for(int j=n-2;j>=0;j--){
            ssum[j]=ssum[j+1]+A[j];
        }
        int ans = Math.max(psum[B-1],ssum[n-B]);
        for(int i=1;i<B;i++){
            int sum = psum[i-1]+ssum[n-(B-i)];
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String args[]){
        int[] A={2, 3, -1, 4, 2, 1};
        int B=4;
        int result= solve(A,B);
        System.out.print(result);
    }
}
