class Solution {
    private int[] original;
    private int[] array;
    private Random rand = new Random();
    public Solution(int[] nums) {
        this.original = nums.clone();
        this.array = nums.clone();
    }
    
    public int[] reset() {
        //array = original.clone();
        return original;
    }
    
    public int[] shuffle() {

        for(int i =0; i<array.length; i++)
        {
            int j = rand.nextInt(i+1);
            int temp = array[j];
            array[j] = array[i];
            array[i]= temp;
          
        }
          return array;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */