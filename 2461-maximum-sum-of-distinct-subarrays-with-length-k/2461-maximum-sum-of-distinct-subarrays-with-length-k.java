class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        Set<Integer> set = new HashSet<>();

        long maxSum = 0;
        long sum = 0;
        //sliding window + hash set logic
        for(int right = 0; right< nums.length; right++)
        {
            while(set.contains(nums[right]))
            {
                set.remove(nums[left]);
                sum -= nums[left];
                left++; 
            }

           
            set.add(nums[right]);

            sum += nums[right];

             if(right -left +1 ==k )
            {
                //update max 
                maxSum = Math.max(sum, maxSum);

                //slide window
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}