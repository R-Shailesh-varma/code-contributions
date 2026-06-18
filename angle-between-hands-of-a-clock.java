class Solution {
    public double angleClock(int hour, int minutes) {
        hour %= 12;
        double min = 6 * minutes;
        double hr = (hour*30) + (min / 12);
        double cur = Math.abs(min - hr);
        return Math.min(cur, 360 - cur);
    }
}