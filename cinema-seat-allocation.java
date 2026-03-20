import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] seat : reservedSeats) {
            map.computeIfAbsent(seat[0], k -> new HashSet<>()).add(seat[1]);
        }
        int count = 2 * n; 
        for (int rowNum : map.keySet()) {
            Set<Integer> row = map.get(rowNum);
            boolean left = !(row.contains(2) || row.contains(3) || row.contains(4) || row.contains(5));
            boolean right = !(row.contains(6) || row.contains(7) || row.contains(8) || row.contains(9));
            boolean mid = !(row.contains(4) || row.contains(5) || row.contains(6) || row.contains(7));
            int temp = 0;
            if (left) temp++;
            if (right) temp++;
            if (!left && !right && mid) temp++;

            count -= (2 - temp);
        }

        return count;
    }
}