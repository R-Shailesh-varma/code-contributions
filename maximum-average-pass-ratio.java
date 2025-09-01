class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        // Max-heap: compare by "gain" after adding one student
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> Double.compare(
                gain(b[0], b[1]),
                gain(a[0], a[1])
            )
        );

        for (int[] cls : classes) {
            maxHeap.add(cls);
        }

        while (extraStudents-- > 0) {
            int[] cls = maxHeap.poll();
            cls[0]++; // add one passing student
            cls[1]++; // total students increase
            maxHeap.add(cls); // push back updated class
        }

        double ans = 0;
        for (int[] cls : maxHeap) {
            ans += (double) cls[0] / cls[1];
        }
        return ans / classes.length;
    }

    private double gain(int pass, int total) {
        return (double)(pass + 1) / (total + 1) - (double)pass / total;
    }
}
