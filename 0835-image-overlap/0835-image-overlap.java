class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        List<int[]> list1=new ArrayList<>();
        List<int[]> list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(img1[i][j]==1){
                    list1.add(new int[]{i,j});
                }
                if(img2[i][j]==1){
                    list2.add(new int[]{i,j});
                }
            }
        }
        int maxcommonoverlap=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int[] p1:list1){
            for(int[] p2:list2){
                int dx=p1[0]-p2[0];
                int dy=p1[1]-p2[1];
                String key=dx+","+dy;
                int count=map.getOrDefault(key,0)+1;
                map.put(key,count);
                maxcommonoverlap=Math.max(maxcommonoverlap,count);
            }
        }
        return maxcommonoverlap;
    }
}