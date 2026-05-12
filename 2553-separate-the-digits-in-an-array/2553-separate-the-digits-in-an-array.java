class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums){
            ArrayList<Integer> temp=new ArrayList<>();
            int n=num;
            while(num>0){
                int ld=num%10;
                temp.add(ld);
                num=num/10;
            }
            for(int i=temp.size()-1;i>=0;i--){
                list.add(temp.get(i));
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}