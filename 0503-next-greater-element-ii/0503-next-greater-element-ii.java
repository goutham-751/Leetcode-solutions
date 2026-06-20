class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] result=new int[nums.length];
        Arrays.fill(result,-1);
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                int index=st.pop();
                result[index]=nums[i];
            }
            st.push(i);
        }
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                int index=st.pop();
                result[index]=nums[i];
            }
            st.push(i);
        }
        return result;
    }
}