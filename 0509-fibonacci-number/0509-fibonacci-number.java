class Solution {
    public int fib(int n) {
        //dp approach
        
        if(n==0) return 0;


        //n+1 because [0, 1, ....] these two are default values in fibinocci

        int[] dp = new int[n+1];

        dp[1] = 1;//default

        //current no is addition of past two
        for(int i =2 ; i<n+1; i++)
        {
            dp[i] =  dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}