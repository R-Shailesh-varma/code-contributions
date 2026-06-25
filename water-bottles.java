class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;

        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int remainingEmpty = numBottles % numExchange;

            total += newBottles;
            numBottles = newBottles + remainingEmpty;
        }

        return total;
    }
}