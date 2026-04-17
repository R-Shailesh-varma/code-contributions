class Solution {
    class Pair{
        char c;
        int n;
        Pair(char c, int n){
            this.c = c;
            this.n = n;
        }
    }
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Deque<Pair> dq = new ArrayDeque();
        for(char c: s.toCharArray()){
            if(!dq.isEmpty() && dq.peekLast().c == c){
                dq.peekLast().n++;
                if(dq.peekLast().n == k) dq.pollLast();
            }else{
                dq.addLast(new Pair(c, 1));
            }
        }  
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty()){
            Pair p = dq.pollFirst();
            for(int i = 0; i < p.n; i++) sb.append(p.c);
        }

        return sb.toString();

    }
}