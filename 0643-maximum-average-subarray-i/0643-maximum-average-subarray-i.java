class Solution {
    public double findMaxAverage(int[] nums, int k) {

        //sliding window with fixed size

        int left =0; 
        double current = 0;
        double max = Integer.MIN_VALUE;

        for(int right = 0; right< nums.length; right++)
        {
            current += nums[right];
            if(right - left +1 == k)
            {
                max = Math.max(max, current/k);
                current -= nums[left];
                left++;
            }    
        }
        return max;
    }
}