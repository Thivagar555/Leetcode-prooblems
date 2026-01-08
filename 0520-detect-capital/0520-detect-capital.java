class Solution {
    public boolean detectCapitalUse(String word) {
        
        int n = word.length();
        if (n <= 1) return true;

        int upperCount = 0;
        for (int i = 0; i < n; i++) {
            if (word.charAt(i) <= 'Z') {
                upperCount++;
            }
        }

        // Case 1: All capitals (USA)
        if (upperCount == n) return true;
        
        // Case 2: All lowercase (leetcode)
        if (upperCount == 0) return true;
        
        // Case 3: Only the first letter is capital (Google)
        if (upperCount == 1 && word.charAt(0) <= 'Z') return true;

        return false;

    }
}