class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> uniqueNums = new HashSet();
        for (int i = 0; i < nums.length; i++) {

            if (uniqueNums.contains(nums[i])){
                return true;
            } else {
                uniqueNums.add(nums[i]);
            }

        }

        return false;

    }
}
