class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> anagramsMap = new HashMap();

        for (int i = 0; i < strs.length; i++) {
            int[] charCount = new int[26];


            for (int j = 0; j < strs[i].length(); j++) {
                charCount[strs[i].charAt(j) - 'a']++;
            }

           String key = Arrays.toString(charCount);
           anagramsMap.putIfAbsent(key, new ArrayList<>());
           anagramsMap.get(key).add(strs[i]);

        }

        List<List<String>> result = new ArrayList<>(anagramsMap.values());
        
        return result;
    }
}
