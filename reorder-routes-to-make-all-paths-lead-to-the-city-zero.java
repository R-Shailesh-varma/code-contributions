class Solution {
    public int minReorder(int n, int[][] connections) {
        
        List<List<int[]>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) graph.add(new ArrayList<>());
        boolean reached[] = new boolean[n];
        Arrays.fill(reached, false);

        for(int[] i: connections){
            int from = i[0];
            int to = i[1];
            graph.get(from).add(new int[]{to, 1});
            graph.get(to).add(new int[]{from, 0});
        }

        return dfs(graph, 0, reached);
        // return changes;
    }

    private int dfs(List<List<int[]>> graph, int idx, boolean[] visited){
        visited[idx] = true;
        int changes = 0;
        for(int[] nd: graph.get(idx)){
            int node = nd[0];
            if(!visited[node]){
                changes += nd[1];
                changes += dfs(graph, node, visited);
            }
        }return changes;
    }
}