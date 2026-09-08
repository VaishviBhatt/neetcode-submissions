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

        int fleet = 0;
        double lastFleetTime = 0.0;

        for (int[] p : pair) {
            double currentTime = (double) (target - p[0]) / p[1];
            
            if (currentTime > lastFleetTime) {
                fleet ++;
                lastFleetTime = currentTime;
            }
            
        }

        return fleet;
    }
}