class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        char[][] board=new char[n][n];
        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[2*n];
        boolean[] diag2 = new boolean[2*n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        solve(0, n, board, col, diag1, diag2, result);
        return result;
    }
    public void solve(int row , int n,char[][] board, boolean[] col, boolean[] diag1,boolean[] diag2,List<List<String>> result){
        if(row==n){
            List<String> temp=new ArrayList<>();
            for(char[] r:board){
                temp.add(new String(r));
            }
            result.add(temp);
            return;
        }
        for(int c=0;c<n;c++){
            if(col[c]|| diag1[row+c]|| diag2[row-c+n-1]) continue;//skip where it is q (check for diagonals and same col)
            board[row][c]='Q';
            diag1[row+c]=true;
            diag2[row-c+n-1]=true;
            col[c]=true;
            solve(row+1,n,board,col,diag1,diag2,result);
            board[row][c]='.';//backtrack
            col[c]=false;
            diag1[row+c]=false;
            diag2[row-c+n-1]=false;

        }
    }
}