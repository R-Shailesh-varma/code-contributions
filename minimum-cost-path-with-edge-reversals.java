class Solution {
    public int minCost(int n, int[][] edges) {
        
        List<List<int[]>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for(int[] e: edges){
            int u = e[0]; 
            int v = e[1];
            int w = e[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, 2*w});
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->{
            return a[1] - b[1];
        });
        pq.offer(new int[]{0, 0});
        
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int u = curr[0];
            int d = curr[1];

            if(d > dist[u]) continue;

            for(int[] vals: graph.get(u)){
                int v = vals[0];
                int nd = vals[1];
                if(dist[v] > d + nd){
                    dist[v] = d + nd;
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }
        return dist[n-1] == Integer.MAX_VALUE ? -1 : dist[n-1];
    }
}