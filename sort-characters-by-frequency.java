class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char val: s.toCharArray()){
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );

        pq.addAll(freq.entrySet());
        StringBuilder res = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> set;
            set = pq.poll();
            int values = set.getValue();
            while(values > 0){
                res.append(set.getKey());
                values--;
            }
        }

        return res.toString();
    }
}