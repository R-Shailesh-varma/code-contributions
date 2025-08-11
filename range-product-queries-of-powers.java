class Solution {
    static final int MOD = 1_000_000_007;

    public int[] productQueries(int n, int[][] queries) {
        if (queries == null) return new int[0];

        int[] res = new int[queries.length];
        List<Integer> powers = new ArrayList<>();
        int pow = 0;

        // Extract powers of 2 in binary representation of n
        while (n > 0) {
            if ((n & 1) == 1) {
                powers.add(1 << pow);
            }
            pow++;
            n = n >> 1;
        }

        // Prefix product modulo MOD
        List<Integer> prefixProduct = new ArrayList<>();
        prefixProduct.add(powers.get(0) % MOD);
        for (int i = 1; i < powers.size(); i++) {
            long val = (prefixProduct.get(i - 1) * 1L * (powers.get(i) % MOD)) % MOD;
            prefixProduct.add((int) val);
        }

        // Answer queries using modular inverse for division
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            if (left == right) {
                res[i] = powers.get(left) % MOD;
            } else if (left == 0) {
                res[i] = prefixProduct.get(right);
            } else {
                int numerator = prefixProduct.get(right);
                int denominator = prefixProduct.get(left - 1);
                int inv = modInverse(denominator, MOD);
                res[i] = (int) ((1L * numerator * inv) % MOD);
            }
        }
        return res;
    }

    private int modInverse(int a, int m) {
        return powMod(a, m - 2, m);
    }

    private int powMod(int base, int exp, int mod) {
        long result = 1;
        long b = base;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * b) % mod;
            }
            b = (b * b) % mod;
            exp >>= 1;
        }
        return (int) result;
    }
}
