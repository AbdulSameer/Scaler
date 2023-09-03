import java.util.ArrayList;
import java.util.Arrays;

public class AlternatingSubArrays {
    public static int[] solve(int[] A, int B){
        int n = A.length;
        int len = 2*B+1;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<=n-len;i++){
            int prev=-1;
            boolean flag=true;
            for(int j=i;j<i+len;j++){
                if(A[j]==prev){
                    flag=false;
                    break;
                }
                prev=A[j];
            }
            if(flag==true){
                al.add(B+i);
            }
            }
        int[] arr = new int[al.size()];
        for(int k=0;k<al.size();k++){
            arr[k]=al.get(k);
        }
        return arr;
    }

    public static void main(String args[]){
        int[] A ={0, 0, 0, 1, 1, 0, 1};
        int B=0;
        int[] result = solve(A,B);
        System.out.println(Arrays.toString(result));
    }
}
