class Solution {
    public int maxDepth(String s) {
        int counter=0;
        int maxcounter=Integer.MIN_VALUE;
        for(char c:s.toCharArray()){
            if(c=='('){
                counter++;
            }
            else if(c==')'){
                counter--;
            }
            maxcounter=Math.max(maxcounter,counter);
        }
        return maxcounter;
    }
}