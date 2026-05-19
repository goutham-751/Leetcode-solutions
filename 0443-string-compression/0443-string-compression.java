class Solution {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        while(i<chars.length){
            char curr=chars[i];
            int count=0;
            while(i<chars.length && curr==chars[i]){
                i++;
                count++;
            }
            chars[index]=curr;
            index++;
            if(count>1){
                String s=String.valueOf(count);
                for(char c:s.toCharArray()){
                    chars[index]=c;
                    index++;
                }
            }
        }
        return index;
        
    }
}