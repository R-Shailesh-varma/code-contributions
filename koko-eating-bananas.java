class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minV = 1;
        int maxV = 0;
        for (int i : piles) {
            maxV = Math.max(maxV, i);
        }
        return helper(piles, minV, maxV, h);
    }

    private int helper(int[] piles, int low, int high, int h) {
        int ans = high;
        while (low <= high) {
            int bananas = low + (high - low) / 2;
            int timeTaken = hours(piles, bananas);
            if (timeTaken <= h) {
                ans = bananas;
                high = bananas - 1;
            } else {
                low = bananas + 1;
            }
        }
        return ans;
    }

    private int hours(int[] piles, int bananas) {
        long hrs = 0;
        for (int i : piles) {
            // \U0001f527 FIXED: ensure long arithmetic to avoid overflow
            hrs += (i + 0L + bananas - 1) / bananas;
            if (hrs > Integer.MAX_VALUE) return Integer.MAX_VALUE; // optional safety
        }
        return (int) hrs;
    }
}
