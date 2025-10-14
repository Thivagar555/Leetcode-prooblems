class Solution {
    public String longestWord(String[] words) {
        String result = "";
        Arrays.sort(words);
        Set<String> built = new HashSet<>();
        for(String word : words)
        {
            if(word.length()==1 || built.contains(word.substring(0, word.length()-1)))
            {
                built.add(word);
                if(result.length()<word.length())
                {
                    result = word;
                }
            }
        }
        return result;
    }
    
}