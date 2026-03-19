class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            int height = heights[i];
            int count = 0;
            while(!s.isEmpty() && s.peek() < height){
                s.pop();
                count++;
            }

            if(!s.isEmpty()){
                count += 1;
            }

            heights[i] = count;
            s.push(height);
        }
        return heights;
    }
}