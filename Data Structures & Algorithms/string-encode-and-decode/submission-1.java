class Solution {

    public String encode(List<String> strs) {
        String result = "";
        
        for (int i = 0; i < strs.size(); i++) {
            
            result +=  strs.get(i).length() + "#" + strs.get(i);
        
        }

        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();;
        
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            result.add(str.substring(j + 1, i));
        }
       
    
        return result;
    }
}
