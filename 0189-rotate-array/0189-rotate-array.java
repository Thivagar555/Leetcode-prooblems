class Solution {
   
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        //reverse the whole array
        rotateRight(nums, 0, n-1);

        //reverse the first k elements;
       rotateRight(nums, 0, k-1);

        //reverse the remaining n-k elements
       rotateRight(nums, k, n-1 );

    }
    public void rotateRight(int[] nums, int start, int end)
    {
        while(start<end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}