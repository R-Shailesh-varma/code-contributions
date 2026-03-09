class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        int[] inDegree = new int[numCourses];
        for(int[] num: prerequisites){
            adj.get(num[1]).add(num[0]);
            inDegree[num[0]]++;
        }

        int idx = 0;
        int[] ans = new int[numCourses];

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int cur = q.poll();
            ans[idx++] = cur;
            for(int i: adj.get(cur)){
                inDegree[i]--;
                if(inDegree[i] == 0){
                    q.offer(i);
                }
            }
        }

        if(idx != numCourses) return new int[0];
        return ans;
    }
}