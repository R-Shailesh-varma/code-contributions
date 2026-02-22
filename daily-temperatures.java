class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] days = new int[temperatures.length];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = 0; i < days.length; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int top = st.pop();
                days[top] = i - top;
            }st.push(i);
        }
        return days;
    }
}