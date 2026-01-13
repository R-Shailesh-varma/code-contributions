class Solution {
    public double separateSquares(int[][] squares) {
        double total = 0;
        double low = 0;
        double high = 0;
        for(int i = 0; i < squares.length; i++){
            low = Math.min(low, squares[i][1]);
            high = Math.max(high, squares[i][1]+squares[i][2]);
            total +=(double)squares[i][2]*squares[i][2];
        }
        double ans = 0;
        while (high - low > 1e-6){
            double mid = low + (high-low)/2;
            if(isValid(mid, squares, total)){
                high = mid;
                ans = mid;
            }else{
                low = mid;
            }
        }
        return ans;
    }private boolean isValid(double mid, int[][] squares, double total){
        double la = 0; 
        for(int i = 0; i < squares.length; i++){
            double bottom = squares[i][1];
            double side = squares[i][2];
            double top = bottom + side;
            if(top <= mid){
                la += side*side;
            }else if(bottom < mid){
                la += (mid - bottom) * side;
            }
        }return 2*la >= total;
    }
}