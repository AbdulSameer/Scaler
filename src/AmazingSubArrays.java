public class AmazingSubArrays {

    public static int solve(String A){
        int n = A.length();
        int mod=10003;
        int count=0;
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='a'||A.charAt(i)=='A'||A.charAt(i)=='e'||A.charAt(i)=='E'||A.charAt(i)=='i'||A.charAt(i)=='I'||A.charAt(i)=='o'||A.charAt(i)=='O'||A.charAt(i)=='u'||A.charAt(i)=='U'){
                count=(count+(n-i)%mod)%mod;
            }
        }
        return count;
    }

    public static void main(String args[]){
        String A= "Sameer";
        int result=solve(A);
        System.out.print(result);
    }
}
