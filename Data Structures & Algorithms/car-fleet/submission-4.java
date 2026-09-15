class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        if(position.length != speed.length){
            return 0;
        }

        int n = position.length;

        int[][] car = new int[n][2];

        for(int i =0; i < n; i++){
            car[i][0] = position[i];
            car[i][1] = speed[i];
        }

        Arrays.sort(car, (a,b) -> Integer.compare(b[0], a[0]));

        int fleet = 0;
        double lastCarFleetTime = 0.0;

        for(int[] c : car){
            double currentTime = (double) (target - c[0]) / c[1];

            if(currentTime > lastCarFleetTime){
                fleet++;
                lastCarFleetTime = currentTime;
            }
        }

        return fleet;
        
    }
}
