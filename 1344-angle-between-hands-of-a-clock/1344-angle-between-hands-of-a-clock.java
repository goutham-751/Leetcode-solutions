class Solution {
    public double angleClock(int hour, int minutes) {
        double minangle=minutes*6;
        double hourangle=(hour%12)*30+minutes*0.5;
        double difference=Math.abs(hourangle-minangle);
        return Math.min(difference,360-difference);
    }
}