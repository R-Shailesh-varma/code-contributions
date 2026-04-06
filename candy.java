class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] alc = new int[n];
        Arrays.fill(alc, 1);
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i-1]) alc[i] += alc[i-1];
        }

        for(int i = n-2; i >= 0; i--){
            if(ratings[i] > ratings[i+1]) alc[i] = Math.max(alc[i], alc[i+1]+1);
        }

        int ans = 0;
        for(int i: alc) ans += i;
        return ans;

    }
}