class Solution {
    public boolean exist(char[][] board, String word) {
        int rows=board.length;
        int cols=board[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j]==word.charAt(0) && dfs(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,int r,int c,String word,int index){
        if(index==word.length()) return true;
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!=word.charAt(index)){
            return false;
        }
        char temp=board[r][c];
        board[r][c]='#';
        boolean found=dfs(board,r+1,c,word,index+1) || dfs(board,r-1,c,word,index+1) || dfs(board,r,c+1,word,index+1) || dfs(board,r,c-1,word,index+1);
        board[r][c]=temp;
        return found;

    }
}