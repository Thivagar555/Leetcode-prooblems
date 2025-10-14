
//this question give only 10% marks out of 100

public class Main {
    static int MatchPattern(String str) {
        int count = 0;

        // Step 1: filter out non-binary characters
        StringBuilder binary = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '0' || ch == '1')
                binary.append(ch);
        }

        String s = binary.toString();

        // Step 2: find patterns 1[0]*1
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                int j = i + 1;
                // move through all 0s
                while (j < s.length() && s.charAt(j) == '0') {
                    j++;
                }
                // if a '1' found after 0s, pattern found
                if (j < s.length() && j!=i+1 && s.charAt(j) == '1') {
                    count++;
                    i = j - 1; // continue from next position
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input1 = "101asd1000001";
        System.out.println(MatchPattern(input1)); // Output: 2

        String input2 = "1000010101";
        System.out.println(MatchPattern(input2)); // Output: 3
    }
}
