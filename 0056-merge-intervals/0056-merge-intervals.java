class Solution {
    public int[][] merge(int[][] intervals) {
        int rows=intervals.length;
        //int col=2;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> result=new ArrayList<>();
        int[] curr=intervals[0];
        result.add(curr);
        for(int[] interval:intervals){
            if(interval[0]<=curr[1]){
                curr[1]=Math.max(curr[1],interval[1]);
            }
            else{
                curr=interval;
                result.add(curr);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}