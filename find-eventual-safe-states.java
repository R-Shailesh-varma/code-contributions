class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Queue<Integer> q = new LinkedList<>();
        List<List<Integer>> g = new ArrayList<>();
        int[] inDegree = new int[graph.length];

        for(int i = 0; i < graph.length; i++){
            g.add(new ArrayList<>());
        }

        for(int i = 0; i < graph.length; i++){
            for(int j: graph[i]){
                g.get(j).add(i);
                inDegree[i]++;
            }
        }

        for(int i = 0; i < inDegree.length; i++){
            if(inDegree[i] == 0) q.offer(i);
        }

        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int cur = q.poll();
            ans.add(cur);
            for(int i: g.get(cur)){
                inDegree[i]--;
                if(inDegree[i] == 0){
                    q.offer(i);
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
}