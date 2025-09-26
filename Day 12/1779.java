class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minimum = Integer.MAX_VALUE;
        int index = -1;
        
        for(int i =0; i<points.length; i++)
        {
            
            int px = points[i][0];
            int py = points[i][1];
            if(x == px || y ==py  )
            {
                int distance = Math.abs(x-px)+Math.abs(y-py);

            if(distance < minimum)
            {
                minimum = distance;
                index = i;
            }
            }
            
        }
        return index;
    }
}