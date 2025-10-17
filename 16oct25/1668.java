class Solution {//I understood and Implemented this DP
    public int maxRepeating(String sequence, String word) {
       int n = sequence.length(); 
       int m = word.length();
       int[] dp = new int[n+1];
       int max = 0;ddadad
       for(int i=m; i<=n; i++)
       {
          String w = sequence.substring(i-m, i);

          if(word.equals(w))
          {
            dp[i] = dp[i-m]+1;
            max = Math.max(max, dp[i]);
          }
       }
       return max;
    }
}