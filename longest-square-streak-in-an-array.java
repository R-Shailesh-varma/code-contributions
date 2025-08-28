import java.util.HashSet;

class Solution {
    public int longestSquareStreak(int[] nums) {
        HashSet<Long> set = new HashSet<>();
        for (int num : nums) {
            set.add((long) num);  // Use long to avoid overflow
        }

        int maxLength = -1;

        for (int num : nums) {
            int length = 1;
            long current = num;

            while (set.contains(current * current)) {
                current = current * current;
                length++;
            }

            if (length > 1) {
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}
