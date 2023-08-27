public class TimeToEquality {
    public static int solve(int[] A) {
        int n = A.length;
        int val = 0;
        for(int i = 0; i < n; i++) {
            val = Math.max(val, A[i]);
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans += val - A[i];
        }
        return ans;
    }

    public static  void main(String[] args){
    int[] A ={ 2,4,1,3,2};
    //TimeToEquality te = new TimeToEquality();
    int result =solve(A);
    System.out.println(result);
    }
}
