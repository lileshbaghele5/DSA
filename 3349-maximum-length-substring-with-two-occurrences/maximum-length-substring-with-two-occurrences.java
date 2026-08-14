class Solution {
    public int maximumLengthSubstring(String s) {

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);
                freq[ch - 'a']++;

                // If any character occurs more than 2 times
                if (freq[ch - 'a'] > 2) {
                    break;
                }

                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        return maxLength;
    }
}