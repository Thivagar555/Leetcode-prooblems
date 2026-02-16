class Solution {
    public int lengthOfLIS(int[] nums) {
        //core logic = track the count of previous smaller elements than the current elements and store it in current element 
        int n = nums.length;

        int[] dp = new int[n];

        int maxLen = 0;

        //by default every index have one element
        Arrays.fill(dp, 1);
        for(int i=1; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                if(nums[j]<nums[i])
                {
                    //if that index has many small number counts and also smaller than current index then add it to curr
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        
        for(int i : dp)
        {
            maxLen = Math.max(i, maxLen);
        }
        return maxLen;
    }
}