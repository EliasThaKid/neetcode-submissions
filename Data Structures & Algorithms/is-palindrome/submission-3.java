class Solution {
    public boolean isPalindrome(String s) {
       
        String compString = "";
        String compString2 = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                compString += Character.toLowerCase(s.charAt(i));
            }
        }
        

        for (int i = compString.length()-1; i >= 0; i--) {
            compString2 += compString.charAt(i);

        }

        System.out.println("STring1 " + compString);
        System.out.println("STring2 " + compString2);
        

        return compString.equals(compString2);

    }
}
