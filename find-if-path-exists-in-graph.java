class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        return bfs(n, edges, source, destination);
    }boolean bfs(int n, int[][] edges, int source, int destination){
        if(source == destination) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]); 
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int i: adj.get(curr)){
                if(i == destination) return true;
                if(!visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }return false;
    }
}