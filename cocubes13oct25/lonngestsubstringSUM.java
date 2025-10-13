 static int MaxSum(int[] arr) {
        // If array is empty, return 0
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        int maxSoFar = arr[0];  // Maximum sum found so far
        int maxEndingHere = arr[0]; // Maximum sum ending at current position
        
        // Start from the second element
        for (int i = 1; i < arr.length; i++) {
            // Either extend the existing subarray or start a new one
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            
            // Update the overall maximum if needed
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        // In case all numbers are negative, we might get a negative max
        // But problem likely expects at least 0 (as per note: return 0 if array empty)
        return Math.max(maxSoFar, 0);
    }