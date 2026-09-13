class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxarea=0;
        int rows=grid.length;
        int cols=grid[0].length;
        boolean[][] visited=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    int ans=dfs(grid,i,j,visited);
                    maxarea=Math.max(ans,maxarea);
                }
            }
        }
        return maxarea;
    }
    public int dfs(int[][] grid,int row,int col,boolean[][] visited){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || visited[row][col] || grid[row][col]==0){
            return 0;
        }
        visited[row][col]=true;
        return 1+dfs(grid,row-1,col,visited)+dfs(grid,row,col-1,visited)+dfs(grid,row+1,col,visited)+dfs(grid,row,col+1,visited);   
    }
}