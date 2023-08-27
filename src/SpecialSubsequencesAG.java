public class SpecialSubsequencesAG {
    public static int solve(String A){
        int n = A.length();
        int ans=0, count=0;
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='A'){
                count++;
            }
            else if(A.charAt(i)=='G'){
                ans = (ans+count)%100000007;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        String A="ABCGAG";
        int result = solve(A);
        System.out.println(result);

    }
}
