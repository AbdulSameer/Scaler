public class LengthOfLongestConsecutiveOnes {

    public static int solve(String A){
        int n = A.length();
        int count=0;
        //counting total no.of 1's
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='1'){
                count++;
            }
        }
        if(count=='0'){
            return 0;
        }
        if(count==n){
            return n;
        }
        int ans = 0;
        //checking for the occurence of zero in string
        for(int i=0;i<n-1;i++){
            if(A.charAt(i)=='0'){
                int l=0;
                //count no of zeros to the left side
                for(int j=i-1;j>=0;j--){
                    if(A.charAt(j)=='1'){
                        l++;
                    }
                    else{
                        break;
                    }
                }
                int r=0;
                //counting no of zeros to the right side
                for(int j=i+1;j<n-1;j++){
                    if(A.charAt(j)=='1'){
                        r++;
                    }
                    else{
                        break;
                    }
                }
                int k=l+r;
                if(k<count){
                    k++;
                }
                if(k>ans){
                    ans=k;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        String A = "0111011101";
        int result = solve(A);
        System.out.println(result);
    }
}
