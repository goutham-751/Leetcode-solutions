import java.util.Arrays;

class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        // Step 1: Initialize list with given restrictions and the base case (Building 1 has Height 0)
        int m = restrictions.length;
        int[][] adjustedRestrictions = new int[m + 2][2];
        
        for (int i = 0; i < m; i++) {
            adjustedRestrictions[i] = restrictions[i];
        }
        adjustedRestrictions[m] = new int[]{1, 0};
        adjustedRestrictions[m + 1] = new int[]{n, n - 1};
        
        // Sort restrictions by building index
        Arrays.sort(adjustedRestrictions, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Step 2: Left-to-Right Pass
        for (int i = 1; i < adjustedRestrictions.length; i++) {
            int prevIdx = adjustedRestrictions[i - 1][0];
            int prevHeight = adjustedRestrictions[i - 1][1];
            int currIdx = adjustedRestrictions[i][0];
            
            // currHeight = min(currHeight, prevHeight + distance)
            adjustedRestrictions[i][1] = Math.min(adjustedRestrictions[i][1], prevHeight + (currIdx - prevIdx));
        }
        
        // Step 3: Right-to-Left Pass
        for (int i = adjustedRestrictions.length - 2; i >= 0; i--) {
            int nextIdx = adjustedRestrictions[i + 1][0];
            int nextHeight = adjustedRestrictions[i + 1][1];
            int currIdx = adjustedRestrictions[i][0];
            
            // currHeight = min(currHeight, nextHeight + distance)
            adjustedRestrictions[i][1] = Math.min(adjustedRestrictions[i][1], nextHeight + (nextIdx - currIdx));
        }
        
        // Step 4: Calculate the maximum possible height between adjacent restrictions
        int maxHeight = 0;
        for (int i = 0; i < adjustedRestrictions.length - 1; i++) {
            int idx1 = adjustedRestrictions[i][0];
            int h1 = adjustedRestrictions[i][1];
            int idx2 = adjustedRestrictions[i + 1][0];
            int h2 = adjustedRestrictions[i + 1][1];
            
            // Formula to find peak height between two points
            int dist = idx2 - idx1;
            int peak = (h1 + h2 + dist) / 2;
            maxHeight = Math.max(maxHeight, peak);
        }
        
        return maxHeight;
    }
}
