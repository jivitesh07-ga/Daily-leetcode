class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxlen = Math.min(s.length(),1);

        Set<Character> set = new HashSet<>();

        while (end < s.length()) {
            char c = s.charAt(end);

            while (set.contains(c)) {
            set.remove(s.charAt(start));
            start++;
        }
        set.add(c);
        int substring = end - start + 1;
        maxlen = Math.max(maxlen,substring);
        end++;
    }
    return maxlen;
    }
}