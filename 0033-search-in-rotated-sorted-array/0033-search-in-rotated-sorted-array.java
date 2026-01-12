class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        //core logic - if the left side is sorted then  search in left
        //if not found on left search in right 
        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid-1;
                }
                else
                {
                    left = mid+1;
                }
            }
            //right half is sorted
            else
            {
                if(nums[right] >= target && target > nums[mid])
                {
                    left = mid+1;
                }
                else
                {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}