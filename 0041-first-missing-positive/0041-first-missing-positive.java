class Solution {
    public int firstMissingPositive(int[] nums) {
        //core logic : there must be 1 to n (n be the size of the arr) elements in the array

        //nums[x-1] = x - this is only for 1...n

        // if all the 1....n present then the answer must be n+1;

        //ignore negatives and zeros
        
        //if  nums[i] > 0 then swap it their orginal place nums[nums[i] - 1] 
        //finally iterate it  and find which element is not in its place
        int n = nums.length;

        for(int i = 0; i<n; i++)
        {
            while(nums[i]>0 && nums[i]<=n && nums[nums[i]-1] != nums[i])
            {
                int x = nums[i];
                int correctIdx = x-1;
                int temp = nums[x-1];


                nums[correctIdx] =x;
                nums[i] = temp;
            }
        }
        for(int i=0; i<n; i++)
        {
           if(nums[i] != i+1)
           return i+1;
        }
        return n+1;
    }
}