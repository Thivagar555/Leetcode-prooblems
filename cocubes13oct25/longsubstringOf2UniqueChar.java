import java.util.*;

class Solution {
    static String FindSubstring(String str) {
        int left = 0;
        int maxLen = 0;
        String result = "";
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            map.put(ch, right); // store last seen index

            // If more than 2 unique chars, shrink window
            if (map.size() > 2) {
                int leftMost = Collections.min(map.values());
                char charToRemove = str.charAt(leftMost);
                map.remove(charToRemove);
                left = leftMost + 1;
            }

            // Update result
            int windowLen = right - left + 1;
            if (windowLen > maxLen || (windowLen == maxLen)) {
                maxLen = windowLen;
                result = str.substring(left, right + 1);
            }
        }

        return result;
    }
}
