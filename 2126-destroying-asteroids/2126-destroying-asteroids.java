class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        boolean flag=false;
        long massconsumed=mass;
        for(int i:asteroids){
            if(massconsumed>=i){
                massconsumed=massconsumed+i;
                flag=true;
            }
            else if(mass<i){
                flag=false;
            }
        }
        return flag;
    }
}