class Solution {
    public boolean judgeCircle(String moves) {
        char[] str=moves.toCharArray();
        int countu=0;
        int countd=0;
        int countl=0;
        int countr=0;
        for(char i:str){
            if(i=='U') countu++;
            if(i=='D')countd++;
            if(i=='L') countl++;
            if(i=='R') countr++;
        }
        if(countu==countd && countl==countr) return true;
        else{
            return false;
        }

    }
}