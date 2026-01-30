class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        Set<Integer> set = new HashSet<>();

        //fixed size Sliding window + hash set logic
        for(int right = 0; right< nums.length; right++)
        {
            //if length exceed our window k shrink left 
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