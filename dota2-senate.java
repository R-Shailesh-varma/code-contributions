class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rq = new LinkedList<>();
        Queue<Integer> dq = new LinkedList<>();
        int n = senate.length();
        
        for(int i = 0; i < n; i++){
            if(senate.charAt(i) == 'R'){
                rq.offer(i);
            }else{
                dq.offer(i);
            }
        }

        while(!dq.isEmpty() && !rq.isEmpty()){
            if(dq.peek() < rq.peek()){
                int num = dq.poll();
                rq.poll();
                dq.offer(num + n);
            }else{
                int num = rq.poll();
                dq.poll();
                rq.offer(num + n);
            }
        }

        return dq.isEmpty() ? "Radiant" : "Dire" ;

    }
}