class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        int n= nums.length;

        for(int i=0; i<n ; i++)
        {
            while(nums[i] > 0 && nums[nums[i] - 1] != nums[i])
            {
                int x = nums[i];
                int correctIdx = x-1;
                int temp = nums[correctIdx];

                //swap
                nums[correctIdx] = x;
                nums[i] = temp;
            }
        }
        for(int i=0; i<n;i++)
        {
            if(nums[i] != i+1)
            {
                list.add(i+1);
            }
        }
        return list;
    }
}