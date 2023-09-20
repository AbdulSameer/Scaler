public class MinimumSwaps {
    //count all elements less than B
    //size of subarray is fixed
    //we need to find subarrays in which swaps are minimum

    public static int solve(int[] A, int B){
        int n = A.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(A[i]<=B){
                count++;
            }
        }
        System.out.println("numbers less than B: "+count);
        if(count==0||count==1) {
            return 0;
        }
        int s=0,e=count, bad=0;
        for(int i=0;i<count;i++){
            if(A[i]>B){
                bad++;
            }
        }
        System.out.println("no of bad elements: "+bad);
        int ans=bad;
        while(e<n){
            if(A[s]>B){
                bad--;
            }
            if(A[e]>B){
                bad++;
            }
            if(bad<ans){
                ans=bad;
            }
            s++;
            e++;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] A = {1, 12, 10, 3, 14, 10, 5};
        int B= 8;
        int result = solve(A,B);
        System.out.println(result);
    }
}
