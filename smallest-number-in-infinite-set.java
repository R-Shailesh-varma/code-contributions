class SmallestInfiniteSet {

    private int current; 
    private PriorityQueue<Integer> pq;
    private Set<Integer> container;

    public SmallestInfiniteSet() {
        current = 1;
        container = new HashSet<>();
        pq = new PriorityQueue<>();
    }
    
    public int popSmallest() {
        if(!pq.isEmpty()){
            int ans = pq.poll();
            container.remove(ans);
            return ans;
        }return current++;
    }
    
    public void addBack(int num) {
        if(num < current && !container.contains(num)){
            pq.offer(num);
            container.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */