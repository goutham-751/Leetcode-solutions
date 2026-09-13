class Solution {
    private static final int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public boolean containsCycle(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    if(dfs(grid,i,j,visited,grid[i][j],-1,-1)){
                        return true;//-1 -1 intial parent for the fresh start of dfs
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] grid,int r,int c,boolean[][] visited,char target,int pr,int pc){
        visited[r][c]=true;
        for(int[] dir:DIRS){
            int nr=r+dir[0];
            int nc=c+dir[1];
            if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==target){
                if(nr==pr && nc==pc){//skip if its a parent cell 
                    continue;
                }
                if(visited[nr][nc]){
                    return true;//there is a cycle as we have alreayd visited this char and this is not a parent cell too
                }
                if (dfs(grid,nr,nc,visited,target,r,c)) {
                    return true;
                }
            }

        }
        return false;
    }
}