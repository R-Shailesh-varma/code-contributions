class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        int[] inDegree = new int[numCourses];
        for(int[] num: prerequisites){
            adj.get(num[1]).add(num[0]);
            inDegree[num[0]]++;
        }

        int count = 0;

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int cur = q.poll();
            count++;
            for(int i: adj.get(cur)){
                inDegree[i]--;
                if(inDegree[i] == 0){
                    q.offer(i);
                }
            }
        }

        return count == numCourses;

    }
}