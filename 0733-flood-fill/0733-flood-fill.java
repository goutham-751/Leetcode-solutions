class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalcolour=image[sr][sc];
        if(originalcolour!=color){
            dfs(image,sr,sc,originalcolour,color);
        }
        return image;
    }
    public void dfs(int[][] image,int sr,int sc,int origcolor,int newcolour){
        int rows=image.length;
        int cols=image[0].length;
        if(sr<0 || sc<0 || sr>=rows || sc>=cols || image[sr][sc]!=origcolor){
            return;
        }
        image[sr][sc]=newcolour;
        dfs(image,sr+1,sc,origcolor,newcolour);
        dfs(image,sr,sc+1,origcolor,newcolour);
        dfs(image,sr-1,sc,origcolor,newcolour);
        dfs(image,sr,sc-1,origcolor,newcolour);
    }

}