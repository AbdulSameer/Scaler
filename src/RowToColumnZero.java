public class RowToColumnZero {
public static int[][] solve(int[][] A){
    int row = A.length;
    int col = A[0].length;
    for(int i=0;i<row;i++){
        int flag=0;
        for(int j=0;j<col;j++){
            if(A[i][j]==0){
                flag=1;
            }
        }
        if(flag==1){
            for(int j=0;j<col;j++){
                if(A[i][j]!=0) A[i][j]=-1;
            }
        }
    }
    for(int j=0;j<col;j++){
        int flag=0;
        for(int i=0;i<row;i++){
            if(A[i][j]==0){
                flag=1;
            }
        }
        if(flag==1){
            for(int i=0;i<row;i++){
               if(A[i][j]!=0) A[i][j]=-1;
            }
        }
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(A[i][j]==-1){
                A[i][j]=0;
            }
        }
    }
    return A;
}
    public static void main(String[] args){
        int[][] A = {{1,2,3,4},{5,6,7,0},{9,2,0,4}};
        int[][] result = solve(A);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

    }
}
