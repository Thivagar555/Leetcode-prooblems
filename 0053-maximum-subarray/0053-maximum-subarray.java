class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane’s Algorithm

//      =👉 At every index, decide:

// Start a new subarray, or

// Continue the previous subarray

// We keep track of:

// currentSum → best sum ending at current index

// maxSum → best sum seen so far
        int currentSum =nums[0], maxSum = nums[0];

        for(int i =1; i<nums.length; i++)
        {
            currentSum = Math.max(currentSum+nums[i], nums[i]);

            maxSum = Math.max(currentSum, maxSum);

        }
        return  maxSum;
    }
}
// If your running sum becomes negative, it will only reduce future sums.
// So drop it and start fresh.