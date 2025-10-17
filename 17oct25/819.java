class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
           HashMap<String,Integer> map = new HashMap<>();
        StringBuilder word = new StringBuilder();
        
        // Build frequency map
        for(int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if(Character.isLetter(c)){
                word.append(Character.toLowerCase(c)); // make lowercase
            } else {
                if(word.length() > 0){
                    String key = word.toString();
                    map.put(key, map.getOrDefault(key, 0) + 1);
                    word.setLength(0);
                }
            }
        }
        // last word
        if(word.length() > 0){
            String key = word.toString();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // Remove banned words
        for(String s : banned){
            map.remove(s.toLowerCase());
        }

        // Find max frequency word (lexicographical tie-breaker)
        String ans = "";
        int max = 0;
        for(String s : map.keySet()){
            int freq = map.get(s);
            if(freq > max || (freq == max && s.compareTo(ans) < 0)){
                max = freq;
                ans = s;
            }
        }

        return ans;
    }
}