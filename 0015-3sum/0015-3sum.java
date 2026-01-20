import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Result list to store all unique triplets
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        int n = nums.length;

        // Step 2: Fix one number nums[i]
        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two pointers
            int left = i + 1;
            int right = n - 1;

            // Step 3: Two-pointer approach
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicates for right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers
                    left++;
                    right--;

                } else if (sum < 0) {
                    // Need a larger sum
                    left++;
                } else {
                    // Need a smaller sum
                    right--;
                }
            }
        }

        return result;
    }
}
