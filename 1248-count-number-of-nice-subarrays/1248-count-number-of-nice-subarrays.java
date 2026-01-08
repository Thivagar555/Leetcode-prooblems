class Solution {
    //refer prob 560 for logic
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0,1);
        int count = 0;
        int prefixSum = 0;

        for(int i : nums)
        {
            if(i%2 != 0)
            {
                prefixSum ++;
            }

            if(map.containsKey(prefixSum-k))
            {
                count += map.get(prefixSum-k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}