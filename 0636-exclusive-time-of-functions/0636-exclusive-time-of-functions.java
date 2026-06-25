import java.util.List;
import java.util.Stack;

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;
        
        for (String log : logs) {
            // Split the log into id, type ("start" or "end"), and timestamp
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int currTime = Integer.parseInt(parts[2]);
            
            if (type.equals("start")) {
                // If another function is already running, pause it and add its elapsed time
                if (!stack.isEmpty()) {
                    result[stack.peek()] += currTime - prevTime;
                }
                // Push the new function onto the stack and update prevTime
                stack.push(id);
                prevTime = currTime;
            } else {
                // Function ends: calculate its time block (+1 because it finishes at the end of the unit)
                result[stack.pop()] += currTime - prevTime + 1;
                // The next event effectively starts at the beginning of the next time unit
                prevTime = currTime + 1;
            }
        }
        
        return result;
    }
}