class Solution {
    public int characterReplacement(String s, int k) {
        int[] charFreq = new int[26];
        int left = 0;
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            
            charFreq[s.charAt(i) - 'A']++;

            int mostFreqChar = 0;
            for (int j = 0; j < charFreq.length; j++) {
                if (charFreq[j] > mostFreqChar) { mostFreqChar = charFreq[j]; } 
            }

            while((i-left+1) - mostFreqChar > k) {
                charFreq[s.charAt(left) - 'A']--;
                left++;
            }

           
            System.out.println("here is i: " + s.charAt(i));
            System.out.println("here is l val: " + left + "here is i val:" + i);
            len = Math.max(len, i-left+1);

        }

        return len;
    }
}
