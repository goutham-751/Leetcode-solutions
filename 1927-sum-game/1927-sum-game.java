class Solution {
    public boolean sumGame(String num) {
        double diff=0;
        for(int i=0;i<num.length()/2;i++){
            int ch=num.charAt(i);
            if(ch=='?'){
                diff=diff+4.5;
            }
            else{
                diff=diff+(ch-'0');
            }
        }
        for(int i=num.length()/2;i<num.length();i++){
            int ch=num.charAt(i);
            if(ch=='?'){
                diff=diff-4.5;
            }
            else{
                diff=diff-(ch-'0');
            }
        }
        return diff!=0.0;
    }
}