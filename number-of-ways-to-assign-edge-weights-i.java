class Solution {
    private static final int MOD = 1000000007;

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] e : edges) {
            graph.computeIfAbsent(e[0], k -> new ArrayList<>()).add(e[1]);
            graph.computeIfAbsent(e[1], k -> new ArrayList<>()).add(e[0]);
        }

        boolean[] vis = new boolean[n + 1];

        int depth = dfs(graph, vis, 1);

        if (depth == 0) return 0;

        return modPow(2, depth - 1);
    }

    private int dfs(Map<Integer, List<Integer>> g, boolean[] vis, int node) {
        vis[node] = true;

        int maxDepth = 0;

        for (int nei : g.getOrDefault(node, Collections.emptyList())) {
            if (!vis[nei]) {
                maxDepth = Math.max(maxDepth, 1 + dfs(g, vis, nei));
            }
        }

        return maxDepth;
    }

    private int modPow(long base, long exp) {
        long res = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return (int) res;
    }
}