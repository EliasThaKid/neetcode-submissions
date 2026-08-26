class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        if (nums[left] == target) {
            return left;
        }

        if (nums[right] == target) {
            return right;
        }

        while (left <= right) {
            int halfpoint = (left+right)/2;

            if (target == nums[halfpoint]) {
                return halfpoint;
            } else if (nums[halfpoint] > target) {
                right = halfpoint-1;
            } else {
                left = halfpoint+1;
            }
        } 


        return -1;
    }
}
