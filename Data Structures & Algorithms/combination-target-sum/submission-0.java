class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, target, 0, 0, res, subset);
        return res;
    }

    public void dfs(int[] nums, int target, int i, int sum, List<List<Integer>> res, List<Integer> subset) {
        if (sum == target) {
            res.add(new ArrayList(subset));
            return;
        } else if (i == nums.length || sum > target) {
            return;
        }

        //add curr to sub
        subset.add(nums[i]);
        dfs(nums, target, i, (nums[i] + sum), res, subset);
        //skipping curr
        subset.remove(subset.size()-1);
        dfs(nums, target, i+1, sum, res, subset);

    
        // subset.add(nums[i]);
        // dfs(nums, target, i+1, sum, res, subset);
        // subset.remove(subset.size()-1);
        // dfs(nums, target, i+1, sum, res, subset);
    }
}
