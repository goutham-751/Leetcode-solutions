import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = numCourses; // Fixed: numCourses is an int, not an array
        int[] visited = new int[numCourses]; // 0: unvisited, 1: visiting, 2: visited
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] pair : prerequisites) {
            adj.get(pair[1]).add(pair[0]);
        }

        // Run DFS for every unvisited node
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                // If a cycle is found, we cannot complete all courses
                if (hasCycle(adj, visited, st, i)) {
                    return false;
                }
            }
        }

        return true;
    }

    // Changed return type to boolean to propagate cycle detection
    public boolean hasCycle(ArrayList<ArrayList<Integer>> adj, int[] visited, Stack<Integer> st, int node) {
        visited[node] = 1; // Mark as VISITING (currently in recursion stack)

        for (int neighbor : adj.get(node)) {
            if (visited[neighbor] == 1) {
                return true; // Found a back-edge -> Cycle detected!
            }
            if (visited[neighbor] == 0) {
                if (hasCycle(adj, visited, st, neighbor)) {
                    return true;
                }
            }
        }

        visited[node] = 2; // Mark as VISITED (completely processed)
        st.push(node);     // Push to stack for topological order
        return false;
    }
}