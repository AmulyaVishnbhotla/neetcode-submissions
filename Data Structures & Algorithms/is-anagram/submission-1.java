class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sArr = new int[26];
        int[] tArr = new int[26];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            sArr[ch - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            tArr[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(sArr[i] != tArr[i]){
                return false;
            }
        }

        return true;
    }
}
