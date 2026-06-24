class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int i = 0;
        int j = 0;
        int max_length = 0;


        while (j<s.length()) {
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }

            set.add(s.charAt(j));
            
            int window_len = j - i + 1;
            max_length = Math.max(window_len,max_length);
            j++;
        }
        return max_length;
    }
}
