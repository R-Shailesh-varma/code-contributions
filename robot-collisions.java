class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> ans = new ArrayList<>();
        Stack<int[]> st = new Stack<>();
        for(int i = 0; i < healths.length; i++){
            int cur[] = new int[]{healths[i], directions.charAt(i) == 'L' ? -1 : 1 };
            if(cur[1] == 1){
                st.push(cur);
            }else{
                while(!st.isEmpty() && st.peek()[0] < cur[0] && st.peek()[1] != cur[1] ){
                    st.pop();
                    cur[0]--;
                }
                if(st.isEmpty() || st.peek()[1] == -1){
                    st.push(cur);
                }else{
                    int[] top = st.pop();
                    top[0]--;
                    st.push(top);
                }
            }
        }
        while(!st.isEmpty()){
            int[] cur = st.pop();
            ans.add(cur[0]);
        }
        Collections.reverse(ans);
        return ans;
    }
}