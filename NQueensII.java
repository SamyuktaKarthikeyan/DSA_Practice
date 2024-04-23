class NQueensII {
    public int totalNQueens(int n) {
        int answer=0;
        int[][] arr=new int[n][n];
        return nQueens(answer, arr, 0, n);
    }
    public int nQueens(int answer, int[][] arr, int col, int n ){
        if(col>=n){
            answer+=1;
            return answer;
        }
        for(int i=0;i<n;i++){
            if(isSafe(arr, i, col, n)){
                arr[i][col]=1;
                answer=nQueens(answer, arr, col+1, n);
            }
            arr[i][col]=0;
        }
        return answer;
    }
    public boolean isSafe(int[][] arr, int row, int col, int n){
      
        for(int i=0;i<col;i++){
            if(arr[row][i]==1){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;){
            if(arr[i][j]==1){
                return false;
            }
            i--;
            j--;
        }
        for(int i=row+1,j=col-1;i<n&&j>=0;){
            if(arr[i][j]==1){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}