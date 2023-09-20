package practice;

public class SumAll {
    public static void main(String args[]){
        int n=3;
        int ans=0;
        for(int i=0;i<n;i++){
            ans = ans+(i+1)*(n-i);
        }
        System.out.println(ans);
    }
}
