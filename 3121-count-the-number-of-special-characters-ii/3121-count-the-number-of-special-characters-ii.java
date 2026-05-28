class Solution {
    public int numberOfSpecialChars(String word) {
        int[] state=new int[26];
        Arrays.fill(state,0);
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isLowerCase(c)){
                int idx=c-'a';
                if(state[idx]==0){
                    state[idx]=1;
                }
                else if(state[idx]==2){
                    state[idx]=-1;
                }
            }
            else{
                int idx=c-'A';
                if(state[idx]==1){
                    state[idx]=2;
                }
                else if(state[idx]==0){
                    state[idx]=-1;
                }
            }

        }
        int count=0;
        for(int c:state){
            if(c==2){
                count++;
            }
        }
        return count;
    }
}