public class MinAndMax {

    public static int solve(int[] A){
        int n = A.length;
        int max=A[0],min=A[0];
        int ans=n;
        for(int i=0;i<n;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        for(int i=0;i<n;i++){
            if(A[i]<min){
                min=A[i];
            }
        }
        if(min==max){
            return 1;
        }
        for(int i=0;i<n;i++){
            if(A[i]==min) {
                for(int j=i+1;j<n;j++){
                    if(A[j]==max){
                        ans=Math.min(ans,j-i+1);
                        break;
                    }
                }
            }

            if(A[i]==max) {
                for(int j=i+1;j<n;j++){
                    if(A[j]==min){
                        ans=Math.min(ans,j-i+1);
                        break;
                    }
                }
            }
        }
        return ans;
    }

    /*public static int solve(int[] A){
        int n = A.length;
        int max=A[0],min=A[0];
        int ans=Integer.MAX_VALUE;
        int mini=-1,maxi=-1;
        for(int i=1;i<n;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        for(int i=1;i<n;i++){
            if(A[i]<min){
                min = A[i];
            }
        }
        if(min==max){
            return 1;
        }
        for(int i=0;i<n;i++){
            if(A[i]==min){
                mini=i;
            }
            if(A[i]==max){
                maxi =i;
            }
            if(mini!=-1&&maxi!=-1){
                ans = Math.min(ans,Math.abs(mini-maxi)+1);
            }

        }
        return ans;
    }
*/
    public static void main(String args[]){
        int[] A = {2, 6, 1, 6, 9};
        int result = solve(A);
        System.out.print(result);
    }
}
