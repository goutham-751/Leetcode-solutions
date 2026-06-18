class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int counter=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                counter++;
                if(counter>1){
                    sb.append(c);
                }
            }
            else if(c==')'){
                counter--;
                if(counter!=0){
                    sb.append(c);
                }
            }
        } 
        return sb.toString();
    }
}