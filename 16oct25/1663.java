class Solution {
    public String getSmallestString(int n, int k) {
        char[] result = new char[n];
        Arrays.fill(result, 'a');

        int remaining = k-n;
        int index = n-1;

        while(remaining > 0)
        {
            result[index]=(char) ('a' + Math.min(25, remaining));
            remaining = remaining  - Math.min(25, remaining);
            index--;
        }
        
        return new String(result);
    }
}