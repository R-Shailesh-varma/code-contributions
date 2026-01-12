class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i = 1; i < points.length; i++){
            ans += minDist(points[i-1], points[i]);
        }return ans;
    }private int minDist(int[] a, int[] b){
        return Math.max(Math.abs(a[0]-b[0]), Math.abs(a[1]-b[1]));
    }
}