class Solution {
    public int nextGreaterElement(int n) {
       char[] arr = String.valueOf(n).toCharArray();
       int len = arr.length;

       int j = len-2;
       while(j>=0 && arr[j]>=arr[j+1])
       {
        j--;
       }

       if(j<0) return -1;

       int i = len-1;

       while(arr[i] <= arr[j] ) i--;

       char temp = arr[i];

       arr[i] = arr[j];
       arr[j] = temp;

       reverse(arr,j+1, len-1);
       
       long value = Long.parseLong(new String(arr));
       return (value>Integer.MAX_VALUE) ? -1 : (int) value;

    }
    public void reverse(char[] arr, int start, int end)
    {
        while(start<end)
        {
            char temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}