class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> map1=pq.poll();
            char c = map1.getKey();
            int  count=map1.getValue();
            for(int i=0;i<count;i++){
                sb.append(c);
            }
        }
        return sb.toString();

    }
}