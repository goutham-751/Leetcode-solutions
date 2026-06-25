class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String c:tokens){

            if(isoperator(c) && !st.isEmpty()){
                int a=st.pop();
                int b=st.pop();
                switch(c){
                    case "+":st.push(a+b);break;
                    case "-":st.push(b-a);break;
                    case "*":st.push(a*b);break;
                    case "/":st.push(b/a);break;
                }
            }
            else{    
                st.push(Integer.parseInt(c));
            }
        }
        return st.pop();

    }
    public boolean isoperator(String c){
        return c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/");
    }
}