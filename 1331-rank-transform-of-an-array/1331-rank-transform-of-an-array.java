class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] result=Arrays.copyOf(arr, arr.length);
        Arrays.sort(result);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.putIfAbsent(result[i],map.size()+1);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}