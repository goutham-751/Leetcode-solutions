class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int presum=0;
        int count=0;
        for(int num:nums){
            presum=presum+num;
            int rem= presum%k;
            if(rem<0){
                rem=rem+k;//handle negative numbers
            }
            if(map.containsKey(rem)){
                count=count+map.get(rem);//frequecy of this particular prefix sum
            }
            map.put(rem,map.getOrDefault(rem,0)+1);//store the rem in map along with its frequency ,also increase frequency along with the remainder
        }
        return count;
    }
}