import java.util.*;

class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        int[] pref = new int[n + 1];

        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + (nums[i] == target ? 1 : -1);
        }

        int[] all = pref.clone();
        Arrays.sort(all);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 1;

        for (int x : all) {
            if (!map.containsKey(x))
                map.put(x, idx++);
        }

        Fenwick bit = new Fenwick(idx);

        long ans = 0;

        for (int x : pref) {
            int id = map.get(x);

            ans += bit.query(id - 1);

            bit.update(id, 1);
        }

        return (int) ans;
    }

    static class Fenwick {
        int[] tree;

        Fenwick(int n) {
            tree = new int[n + 2];
        }

        void update(int i, int val) {
            while (i < tree.length) {
                tree[i] += val;
                i += i & -i;
            }
        }

        int query(int i) {
            int sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= i & -i;
            }
            return sum;
        }
    }
}