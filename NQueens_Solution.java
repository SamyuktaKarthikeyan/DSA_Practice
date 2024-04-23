class NQueens_Solution {
    public List<List<String>> solveNQueens(int n) {
      int[][] arr=new int[n][n];
      List<List<String>> answer=new ArrayList<>();
      return isQueen(answer,arr,0,n);
    }
    public static List<List<String>> isQueen(List<List<String>> answer, int[][] arr, int col, int n){
        if(col>=n){
            answer.add(answermake(arr));
            return answer;
        }
        for(int i=0;i<n;i++){
            if(isValid(arr,i,col,n)){
                arr[i][col]=1;
                isQueen(answer,arr,col+1,n);
            }
                arr[i][col]=0;
        }
        return answer;
    }
    public static List<String> answermake(int[][] arr){
        List<String> answer=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String temp="";
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    temp+=".";
                }
                else{
                    temp+="Q";
                }
            }
            answer.add(temp);
        }
        return answer;
    }
    public static boolean isValid(int[][] arr, int row, int col, int n){
        //standing line
        for(int i=0;i<row;i++){
            if(arr[i][col]==1){
                return false;
            }
        }
        //sleeping line
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


//Reference : https://leetcode.com/problems/n-queens/solutions/4781769/best-explanation-on-leetcode-hard-made-easy-java/