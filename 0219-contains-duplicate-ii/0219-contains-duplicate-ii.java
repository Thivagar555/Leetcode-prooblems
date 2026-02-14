class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       int left =0; 
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        //fixed size sliding window + hash set logic
       for(int right = 0; right<n; right++)
       {
           //if length exceed our window
            while(right - left > k)
            {
                set.remove(nums[left]);
                left++;
            }
            if(set.contains(nums[right]))
            return true;

            set.add(nums[right]);
       }
       return false;
    }
}