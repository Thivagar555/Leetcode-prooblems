class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // int[] time = new int[position.length];
        int n = position.length;
        double[][] car = new double[n][2];
        for (int i = 0; i < n; i++) {
            car[i][0] = position[i];
            //time taken to reach ;;;time = distance/speed
            car[i][1] = (double) (target - position[i]) / speed[i];
        }
        // sort the matrix of array based on postion in descending

        Arrays.sort(car, (a, b) -> Double.compare(b[0], a[0]));
        int fleet = 0;
        double maxTime = 0;
        // System.out.println(Arrays.deepToString(car));
        for (int i = 0; i < n; i++) {
            // Current car takes more time than the fleet ahead
            // So it cannot catch up
            // Hence, it forms a new fleet 
            if (car[i][1] > maxTime) {
                fleet++;
                maxTime = car[i][1];
            }
        }
        return fleet;
    }
}