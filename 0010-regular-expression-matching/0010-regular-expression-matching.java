class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean[][] dp = new boolean[n + 1][m + 1];

        // empty string matches empty pattern
        dp[0][0] = true;

        // empty string vs pattern like a*, a*b*, a*b*c*
        for (int j = 2; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        // fill dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                // case 1: exact match or '.'
                if (pc == sc || pc == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // case 2: '*'
                else if (pc == '*') {
                    // zero occurrence of previous char
                    dp[i][j] = dp[i][j - 2];

                    // one or more occurrence
                    char prev = p.charAt(j - 2);
                    if (prev == sc || prev == '.') {
                        dp[i][j] |= dp[i - 1][j];
                    }
                }
            }
        }

        return dp[n][m];
    }
}
