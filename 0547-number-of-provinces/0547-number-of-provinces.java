class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int V=visited.length;
        int count=0;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                count++;
                dfs(i,isConnected,visited);
            }
        }
        return count;
    }
    public void dfs(int start,int[][] matrix,boolean[] visited){
        visited[start]=true;
        for(int i=0;i<matrix.length;i++){
            if(matrix[start][i]==1 && !visited[i]){
                dfs(i,matrix,visited);
            }
        }

    }
}