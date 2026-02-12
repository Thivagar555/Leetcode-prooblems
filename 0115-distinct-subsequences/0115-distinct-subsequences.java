class Solution {
    public int numDistinct(String s, String t) {
        
        // s is string t is target task is to find the no of distinct ways string can form target

        //core logic : dp[i][j] = number of ways first i chars of s can form first j chars of t
        //s.charAt(i-1) == t.charAt(j-1) --- we have two options whether to take the character or to skip the character

        //to take the character -- dp[i-1][j-1]; (diagonal)
        //to skip the character --dp[i-1][j] (top)


        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n+1][m+1];

        // the string can be formed from empty target ""
        for(int i=0; i<n; i++)
        {
            dp[i][0] = 1;
        }

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                if(s.charAt(i-1) == t.charAt(j-1))
                {
                    //take or skip - diagonal + top
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];;
                }
                else
                {
                    //skip ===  top
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }
}
//         ""  b  a  g
//      -------------
// ""  |  1   0  0  0
// b   |  1   1  0  0
// a   |  1   1  1  0
// b   |  1   2  1  0
// g   |  1   2  1  1
// b   |  1   3  1  1
// a   |  1   3  4  1
// g   |  1   3  4  5
