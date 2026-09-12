class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        int n=numCourses;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pair:prerequisites){
            adj.get(pair[1]).add(pair[0]);
        }
        int[] visited=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                if(hasCycle(adj,visited,st,i)){//there is a cycle
                    return new int[0];
                }
            }
        }
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=st.peek();
            st.pop();
        }
        return result;

    }
    public boolean hasCycle(ArrayList<ArrayList<Integer>> adj, int[] visited, Stack<Integer> st, int node) {
        visited[node] = 1; // VISITING

        for (int neighbor : adj.get(node)) {
            if (visited[neighbor] == 1) {
                return true; // Cycle detected
            }
            if (visited[neighbor] == 0) {
                if (hasCycle(adj, visited, st, neighbor)) {
                    return true;
                }
            }
        }

        visited[node] = 2; // VISITED
        st.push(node);
        return false;
    }
}