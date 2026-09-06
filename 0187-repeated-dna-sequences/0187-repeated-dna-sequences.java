class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int k=10;
        int length=s.length();
        Set<String> first=new HashSet<>();
        Set<String> repeated=new HashSet<>();
        for(int i=0;i<=length-k;i++){//fixed sliding window with size 10 :))
            String sub=s.substring(i,i+10);
            if(first.contains(sub)){
                repeated.add(sub);
            }else{
                first.add(sub);
            }
        }
        return new ArrayList<>(repeated);
    }
}