class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane’s Algorithm

//      =👉 At every index, decide:

// Start a new subarray, or

// Continue the previous subarray

// We keep track of:

// currentSum → best sum ending at current index

// maxSum → best sum seen so far
        int result = nums[0];
         int current = nums[0];
        for(int i =1; i<nums.length; i++)
        {
            current = Math.max(current + nums[i] , nums[i]);

            result = Math.max(current, result);
        }
        return result;
    }
}
// If your running sum becomes negative, it will only reduce future sums.
// So drop it and start fresh.