class Solution {
    private static final int ALPHABET_SIZE = 128;
    public int lengthOfLongestSubstring(String s) {
        int[] positionAfterLastSeen = new int[ALPHABET_SIZE];
        int windowStart = 0;
        int longest = 0;

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            if (positionAfterLastSeen[current] > windowStart) {
                windowStart = positionAfterLastSeen[current];
            }
            longest = Math.max(longest, end - windowStart + 1);
            positionAfterLastSeen[current] = end + 1;
        }

        return longest;
    }
}