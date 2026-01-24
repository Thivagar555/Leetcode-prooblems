class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int left =0;
        int count = 0;
        double sum = 0;

        for(int right = 0; right<arr.length; right++)
        {
            sum += arr[right];

            if(right - left +1 == k)
            {
                double average = sum/k;
                if(average >= threshold)
                {
                    count++;
                }
                sum -= arr[left];
                left++;
            }
        }
        return count;
    }
}