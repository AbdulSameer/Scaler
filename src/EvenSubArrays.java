public class EvenSubArrays {
    public static String solve(int[] A){
        int n = A.length;
        if(n%2!=0||A[0]%2!=0||A[n-1]%2!=0){
            return "NO";
        }
        else{
            return "YES";
        }
    }
    public static void main(String args[]){
        int[] A={2,4,8,7,6};
        String result = solve(A);
        System.out.println(result);
    }
}
