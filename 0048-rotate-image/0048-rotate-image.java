class Solution {
    public void rotate(int[][] matrix) {

        //core logic - do transpose and reverse the each array

        // int[][] adj = new int[n][n];
        int n = matrix[0].length;

        for(int i=0; i<n; i++)
        {
            //j=i prevents double swapping
            for(int j=i; j<n; j++)
            {
                int temp = matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }

        for(int i=0; i<n; i++)
        {
            reverse(matrix[i], n);   
        }
    }
    public void reverse(int[] mat, int n)
    {
        int start = 0; 
        int end = n-1;

        while(start < end)
        {
            int temp = mat[start];
            mat[start] = mat[end];
            mat[end] = temp;

            start++;
            end--;
        }
    }
}