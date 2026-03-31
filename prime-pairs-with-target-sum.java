class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        if(n <= 3) return ans;
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);
        
        for(int p = 2; p * p <= n; p++){
            if(primes[p]){
                for(int i = p*p; i <= n; i += p){
                    primes[i] = false;
                }
            }
        }

        for(int i = 2; i <= n/2; i++){
            if(primes[i] && primes[n-i]){
                ans.add(new ArrayList<>(List.of(i, n-i)));
            }
        }

        return ans;

    }
}