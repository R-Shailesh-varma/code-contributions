import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<String, Double> memo = new HashMap<>();

    public double soupServings(int n) {
        if (n >= 4800) return 1.0;
        int N = (n + 24) / 25;
        return pour(N, N);
    }

    public double pour(int a, int b) {
        if (a <= 0 && b <= 0) return 0.5;
        if (a <= 0) return 1.0;
        if (b <= 0) return 0.0;

        String key = a + "," + b;
        if (memo.containsKey(key)) return memo.get(key);

        double result = 0.25 * (
            pour(a - 4, b) +
            pour(a - 3, b - 1) +
            pour(a - 2, b - 2) +
            pour(a - 1, b - 3)
        );

        memo.put(key, result);
        return result;
    }
}
