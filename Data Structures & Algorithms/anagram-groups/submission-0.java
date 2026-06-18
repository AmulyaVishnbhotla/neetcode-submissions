class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            String tmp = Arrays.toString(freq);

            map.putIfAbsent(tmp, new ArrayList<>());
            map.get(tmp).add(s);
        }

        return new ArrayList<>(map.values());
    }
}