class Solution {
    public int findClosest(int x, int y, int z) {
        int num1 = Math.abs(z - x);
        int num2 = Math.abs(z - y);
        if(num1 == num2){
            return 0;
        }else if(num1 < num2){
            return 1;
        }else{
            return 2;
        }
    }
}