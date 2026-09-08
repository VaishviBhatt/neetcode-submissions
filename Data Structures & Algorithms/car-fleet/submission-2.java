class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        // Sort descending by position
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

        // 1. Make sure the stack holds Double values
        Deque<Double> stack = new ArrayDeque<>();

        for (int[] p : pair) {
            double currentTime = (double) (target - p[0]) / p[1];
            
            if (!stack.isEmpty() && currentTime <= stack.peek()) {
                continue; 
            }
            
            stack.push(currentTime); 
        }

        return stack.size();
    }
}