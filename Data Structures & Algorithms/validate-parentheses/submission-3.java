class Solution {
    public boolean isValid(String s) {

        Stack<Character> openers = new Stack<>();

        Hashtable<Character, Character> corresponders = new Hashtable<Character, Character>() {{
            put('[', ']');
            put('{','}');
            put('(',')');
        }};
    
           
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (corresponders.containsKey(c)) {
                // If c is an opening bracket, push it onto the stack
                openers.push(c);
            } else {
                // If c is a closing bracket, check if it matches the top of the stack
                if (openers.isEmpty() || corresponders.get(openers.pop()) != c) {
                    return false;
                }
            }
        }

        return openers.isEmpty();

        
    } 
}
