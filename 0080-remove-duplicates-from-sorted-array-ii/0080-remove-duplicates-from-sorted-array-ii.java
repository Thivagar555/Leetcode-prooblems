class Solution {
    public int removeDuplicates(int[] nums) {
        //this also used for allow atmost k dupicates in a array
        //j is the position where correct elements should be placed
      int n = nums.length;
        if(n <= 2) return n;

        int j =2;
        for(int i = 2; i<n; i++)
        {
            if(nums[i] != nums[j-2])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
      

    }
}