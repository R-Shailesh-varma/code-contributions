class Solution {
    
    private List<int[]>[] graph;
    private int[] result;
    
    public int[] minEdgeReversals(int n, int[][] edges) {
        graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph[u].add(new int[]{v, 0}); 
            graph[v].add(new int[]{u, 1}); 
        }
        
        result = new int[n];
        
        boolean[] visited = new boolean[n];
        result[0] = dfs(0, visited);
        
        Arrays.fill(visited, false);
        reroot(0, visited);
        
        return result;
    }

    private int dfs(int node, boolean[] visited) {
        visited[node] = true;
        int reversals = 0;
        
        for (int[] neighbor : graph[node]) {
            int nextNode = neighbor[0];
            int cost = neighbor[1];
            
            if (!visited[nextNode]) {
                reversals += cost + dfs(nextNode, visited);
            }
        }
        
        return reversals;
    }
    
    private void reroot(int node, boolean[] visited) {
        visited[node] = true;
        
        for (int[] neighbor : graph[node]) {
            int nextNode = neighbor[0];
            int cost = neighbor[1];
            
            if (!visited[nextNode]) {
                result[nextNode] = result[node] + 1 - 2 * cost;
                reroot(nextNode, visited);
            }
        }
    }
}