import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int numSquares(int n) {
        if (n <= 0) return 0;
        
        // Queue stores the remaining value to be reduced to 0
        Queue<Integer> queue = new LinkedList<>();
        // Set array to track visited states and prevent redundant processing
        boolean[] visited = new boolean[n + 1];
        
        queue.offer(n);
        visited[n] = true;
        
        int level = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++; // Increment depth level for each layer of perfect square used
            
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                
                // Subtract all possible perfect squares from the current remainder
                for (int j = 1; j * j <= current; j++) {
                    int remainder = current - (j * j);
                    
                    // Found the shortest path to 0
                    if (remainder == 0) {
                        return level;
                    }
                    
                    // If not visited, push to the queue
                    if (!visited[remainder]) {
                        queue.offer(remainder);
                        visited[remainder] = true;
                    }
                }
            }
        }
        
        return level;
    }
}
