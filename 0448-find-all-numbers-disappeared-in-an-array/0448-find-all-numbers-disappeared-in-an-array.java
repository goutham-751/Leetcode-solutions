class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;

    }
}