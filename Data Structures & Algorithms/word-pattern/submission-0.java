class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }

        int[] indexP = new int[26];
        HashMap<String, Integer> indexW = new HashMap<>();
        
        int len = pattern.length();
        
        for (int i = 0; i < len; i++) {

            char c = pattern.charAt(i);
            String w = words[i];
            int charIndex = c - 'a';
            int wordLastSeen = indexW.getOrDefault(w, 0);

            if (indexP[charIndex] != wordLastSeen) {
                return false;
            }
            indexP[charIndex] = i + 1;
            indexW.put(w, i + 1);
        }
        return true;
    }
}