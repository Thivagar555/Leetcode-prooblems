class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        //first row can be have only one path
        for(int i=0; i<n; i++)
        {
            dp[0][i] = 1;
        }

        //first col can be have only one path downward
        for(int j=1; j<m; j++)
        {
            dp[j][0] = 1;
        }

        //core Logic : addition of path ways from top and the left 
        for(int i =1; i<m; i++)
        {
            for(int j=1; j<n; j++)
            {
                dp[i][j]= dp[i-1][j]+dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}