class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            stackAdd(s, asteroids[i]);
        }
        
        int[] sol = new int[s.size()];
        for(int i = s.size()-1; i >= 0; i--){
            sol[i] = s.pop();
        }
        
        return sol;
    }private void stackAdd(Stack<Integer> s, int n){
        
        if(s.isEmpty() || n > 0 || s.peek() < 0){
            s.push(n);
            return;
        }
        
        while(!s.isEmpty() && s.peek() > 0 && Math.abs(s.peek()) < Math.abs(n)){
            s.pop();
        }

        if(s.isEmpty() || s.peek() < 0){
            s.push(n);
            return;
        }

        if(s.peek() == Math.abs(n)){
            s.pop();
            return;
        }

    }
}