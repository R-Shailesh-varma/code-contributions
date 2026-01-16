class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxH = longestConsecutive(hBars) + 1;
        int maxV = longestConsecutive(vBars) + 1;
        int side = Math.min(maxH, maxV);
        return side * side;
    }

    private int longestConsecutive(int[] bars) {
        if (bars.length == 0) return 0;

        Arrays.sort(bars);
        int max = 1, curr = 1;

        for (int i = 1; i < bars.length; i++) {
            if (bars[i] == bars[i - 1] + 1) {
                curr++;
            } else {
                curr = 1;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}
