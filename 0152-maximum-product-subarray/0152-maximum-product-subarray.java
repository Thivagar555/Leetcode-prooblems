class Solution {
    public int maxProduct(int[] nums) {
        //kadane's algorithm

//Core Logic (Most Important Part)

// At every element nums[i], we have three choices:

// Start a new subarray at nums[i]

// Extend the previous max product subarray

// Extend the previous min product subarray

// Why include minEndingHere?

// Because multiplying a negative number can turn a minimum into a maximum.

        int maxProd = nums[0];

        int maxEnding=  nums[0];

        int minEnding = nums[0];

        for(int i=1; i<nums.length; i++)
        {
            int temp = maxEnding;

            maxEnding = Math.max(
                nums[i],
                Math.max(maxEnding*nums[i] , minEnding*nums[i])
            );
            minEnding = Math.min(
                nums[i],
                Math.min(temp*nums[i], minEnding*nums[i])
            );

            maxProd = Math.max(maxEnding, maxProd);
        }
        return maxProd;
    }
}