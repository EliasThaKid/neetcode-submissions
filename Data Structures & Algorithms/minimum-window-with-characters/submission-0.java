class Solution {
    public String minWindow(String s, String t) {

        if (t.length() == 0 || s.length() == 0 ) { return ""; } 

        Map<Character, Integer> charFreq = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        int left = 0;
        int need = 0;
        int have = 0;
        int res = Integer.MAX_VALUE;
        int[] indexes = new int[2];


        for (int i = 0; i < t.length(); i++) {

            Character c = t.charAt(i);
            //if not in gives it val of zero which we increment regardles
            charFreq.put(c, charFreq.getOrDefault(c, 0)+1);
            window.put(c, 0);
        }

        need = charFreq.size();

        for (int i = 0; i < s.length(); i++) {

            Character c = s.charAt(i);
            window.put(c, window.getOrDefault(c, 0)+1);

            if (charFreq.containsKey(c) && window.get(c).intValue() == charFreq.get(c).intValue()) {
                have++;
            }

            System.out.println("haves: " + have + " and needs: " + need);
            while (have >= need) {
                System.out.println("in the have loop!!");
                
                if ((i - left + 1 < res)) {
                    res = i - left + 1;
                    indexes[0] = left;
                    indexes[1] = i+1;
                }
                
                Character c2 = s.charAt(left);
                window.put(c2, window.get(c2).intValue()-1);

                if (charFreq.containsKey(c2) && window.get(c2).intValue() < charFreq.get(c2).intValue()) {
                    have--;
                }

                left++;

            }
            
        }
        
        System.out.println("index1: " + indexes[0] + " and index2: " + indexes[1]);
        if (res == Integer.MAX_VALUE) { return ""; }

        return s.substring(indexes[0], (indexes[1]));
    }
}
