class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int window = 0; window < nums.length - 2; window++) {
            if (window > 0 && nums[window] == nums[window - 1]) {
                continue; // Skip duplicate elements
            }
            
            int target = nums[window];
            int left = window + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = target + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(target, nums[left], nums[right]));
                    left++;
                    right--;
                    
                    // Skip duplicate elements
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return result;

    }
}
