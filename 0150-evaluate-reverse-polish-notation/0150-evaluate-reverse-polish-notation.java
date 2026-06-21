class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String token:tokens){
            if(isoperator(token)){
                int a=st.pop();
                int b=st.pop();
                switch(token){
                    case "+": st.push(a+b); break;
                    case "-": st.push(b-a);break;
                    case "/":st.push(b/a);break;
                    case "*":st.push(a*b);break;
                }    
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();//this will be your final result
    }
    public boolean isoperator(String token){
        return token.equals("+") ||  token.equals("*") ||  token.equals("-") ||  token.equals("/");
    }
}