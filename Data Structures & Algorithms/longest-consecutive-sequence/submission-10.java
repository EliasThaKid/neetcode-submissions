class Solution {
    public int longestConsecutive(int[] nums) {
       
        HashSet<Integer> numsVal = new HashSet<>();
        int longestLen = 0;
        int countedLen = 0;

        if (nums.length == 1){ return 1; }

        for (int i = 0; i < nums.length; i++) {
            numsVal.add(nums[i]);
        }

        Iterator<Integer> setIterator = numsVal.iterator();

        while (setIterator.hasNext()) {
            int curr = setIterator.next();
            if (!numsVal.contains(curr-1)) {
                int startNum = curr;
                countedLen = 1;
                while(numsVal.contains(startNum+countedLen)) {
                    countedLen++;
                    if (countedLen > longestLen) { longestLen = countedLen; }
                }
            }
        }
        
        if (countedLen > longestLen) { longestLen = countedLen; }
        
        return longestLen;

    }
}
