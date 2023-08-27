import java.util.Arrays;

public class MaximumSubArrayEasy {

    public static int solve(int B, int[] C) {
        /*int A = C.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A;i++){
            int sum =0;
            for(int j=i;j<A;j++){
                sum+=C[j];
                if(sum<=B){
                    max=Math.max(sum,max);
                }
                else if(sum>B&&A==2){
                    return 0;
                }
            }
        }
        return max;*/
        //bruteforce
     /*   int n = C.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum =0;
                for(int k=i;k<=j;k++){
                    sum=sum+C[k];
                    if(sum>B){
                        break;
                    }
                    else{
                        ans = Math.max(ans,sum);
                }
            }
        }

    }
        return ans;
    }*/
        int A = C.length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < A; i++) {
            int sum = 0;
            for (int j = i; j < A; j++) {
                sum = sum + C[j];
                if (sum > B) {
                    break;
                } else {
                    ans = Math.max(ans, sum);
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int B=12;
        int[] C={2, 1, 3, 4, 5};
        int result = solve(B,C);
        System.out.println(result);


    }
}
