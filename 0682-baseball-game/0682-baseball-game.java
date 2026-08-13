class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                int top=st.pop();
                int newno=top+st.peek();
                st.push(top);
                st.push(newno);

            }
            else if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                int top=st.peek();
                st.push(2*top);
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int total=0;
        for(int i:st){
            total+=i;
        }
        return total;
    }
}