class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int windowSize = n - k;

        int total = 0;
        for (int x : cardPoints) {
            total += x;
        }

        if (windowSize == 0) {
            return total;
        }

        int sum = 0;
        for (int i = 0; i < windowSize; i++) {
            sum += cardPoints[i];
        }

        int min = sum;

        for (int i = windowSize; i < n; i++) {
            sum += cardPoints[i];
            sum -= cardPoints[i - windowSize];
            min = Math.min(min, sum);
        }

        return total - min;
    }
}