class Solution {
    public boolean backspaceCompare(String s, String t) {

        //stack approach
        return build(s).equals(build(t));
    }
    private static String build(String word)
    {
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<word.length(); i++)
        {
            char ch = word.charAt(i);
            if(ch != '#')
            {
               sb.append(ch);
            }
            //this condition accesed when ch==#
            else if(sb.length() > 0)
            {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        // System.out.println(sb.toString());
        return sb.toString();
    }
}