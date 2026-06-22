class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(st.isEmpty() || asteroids[i]>0){
                st.push(asteroids[i]);
            }
            else{
                while(!st.isEmpty()){
                    int top=st.peek();
                    if(top<0){
                        st.push(asteroids[i]);
                        break;
                    }
                    else{
                        int modval=Math.abs(asteroids[i]);
                        if(top==modval){
                            st.pop();
                            break;
                        }
                        else if(top>modval){
                            break;
                        }
                        else{
                            st.pop();
                            if(st.isEmpty()){
                                st.push(asteroids[i]);
                                break;
                            }
                        }
                    }
                }
            }
        }
        int[] result=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            result[i]=st.pop();
        }
        return result;
    }

}