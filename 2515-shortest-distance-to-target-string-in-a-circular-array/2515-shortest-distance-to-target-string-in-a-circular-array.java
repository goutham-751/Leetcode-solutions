class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int mindistance=n;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int distance=Math.abs(i-startIndex);
                int circulardistance=Math.min(distance,n-distance);
                mindistance=Math.min(mindistance,circulardistance);
            }
   
        }
        return mindistance==n ? -1:mindistance;
    }
}