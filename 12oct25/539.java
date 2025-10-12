class Solution {
    public int findMinDifference(List<String> timePoints) {
        //int n = timePoints.size();
        if(timePoints.size()>1440) return 0;
        int[] arr = new int[timePoints.size()];

          for (int i = 0; i < timePoints.size(); i++) {
            String[] t = timePoints.get(i).split(":");
            int total = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
            arr[i] = total;
        }
        Arrays.sort(arr);
       
        int minDiff = 1440 - (arr[timePoints.size()-1] - arr[0]);

        
        for (int i = 1; i <timePoints.size(); i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }
        
        return minDiff;
    }
}