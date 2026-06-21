class Solution {
    int[] arr;
    boolean isFlag = true;

    public int[] constructDistancedSequence(int n) {
        int size = 2 * n - 1;
        int[] cur = new int[size];
        boolean[] vis = new boolean[n + 1];

        helper(n, cur, vis, 0);
        return arr;
    }

    private void helper(int n, int[] cur, boolean[] vis, int idx) {

        if (!isFlag) return;

        if (idx == cur.length) {
            isFlag = false;
            arr = cur.clone();
            return;
        }

        if (cur[idx] != 0) {
            helper(n, cur, vis, idx + 1);
            return;
        }

        for (int i = n; i > 0 && isFlag; i--) {

            if (vis[i]) continue;

            if (i == 1) {
                vis[i] = true;
                cur[idx] = 1;

                helper(n, cur, vis, idx + 1);

                vis[i] = false;
                cur[idx] = 0;

            } else {
                int j = idx + i;

                if (j < cur.length && cur[j] == 0) {

                    vis[i] = true;
                    cur[idx] = cur[j] = i;

                    helper(n, cur, vis, idx + 1);

                    vis[i] = false;
                    cur[idx] = cur[j] = 0;
                }
            }
        }
    }
}