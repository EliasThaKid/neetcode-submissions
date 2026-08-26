class Solution {
    public int maxArea(int[] heights) {
       
        int l = 0;
        int r = heights.length - 1;
        int maxWater = Integer.MIN_VALUE;

        while (l < r) {
        
            if (heights[l] < heights[r]) {
                if (heights[l] * (r-l) > maxWater) {
                    maxWater = heights[l] * (r-l); 
                }
                l++;
            } else {
                if (heights[r] * (r-l) > maxWater) {
                    maxWater = heights[r] * (r-l); 
                }
                r--;
            }

        }

        return maxWater;
    }
}
