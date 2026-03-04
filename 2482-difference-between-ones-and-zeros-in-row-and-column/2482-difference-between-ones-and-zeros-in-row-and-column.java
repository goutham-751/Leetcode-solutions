class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] rowones=new int[m];
        int[] colones=new int[n];
        int[] rowzeroes=new int[m];
        int[] colzeroes=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    rowones[i]++;
                    colones[j]++;
                }
                else{
                    rowzeroes[i]++;
                    colzeroes[j]++;
                }
            }
        }
        int[][] diff=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                diff[i][j]=rowones[i]+colones[j]-rowzeroes[i]-colzeroes[j];
            }
        
        }
        return diff;
    }

}