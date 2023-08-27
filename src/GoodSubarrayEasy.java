public class GoodSubarrayEasy {
    public static int solve(int[] A, int B){
        int n = A.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+A[j];
                int len = j-i+1;
                if(sum<B&&A[j]%2==0)count++;
                if(sum>B&&A[j]%2==1)count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        int[] A ={13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int B= 65;
        System.out.println(solve(A,B));
    }
}
