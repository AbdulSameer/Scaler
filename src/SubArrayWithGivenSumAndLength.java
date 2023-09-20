public class SubArrayWithGivenSumAndLength {
public static int solve(int[] A, int B, int C){
    int n = A.length;
    int sum = 0;
    for(int i=0;i<B;i++){
        sum+=A[i];
    }
    if(sum==C){
        return 1;
    }
    int s=1,e=B;
    while(e<n){
        if(sum==C){
            return 1;
        }
        sum=sum-A[s-1]+A[e];
        s++;
        e++;
    }
    return 0;
}
    public static void main(String[] args){
        int[] A= {4, 3, 2, 6, 1};
        int B=3;
        int C=11;
        int result = solve(A,B,C);
        System.out.println(result);
    }
}
