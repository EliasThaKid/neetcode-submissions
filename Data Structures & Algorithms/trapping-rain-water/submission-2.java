class Solution {
    public int trap(int[] height) {
       
        int l = 0;
        int maxLeft = 0;
        int r = height.length-1;
        int maxRight = 0;
        int totalWater = 0;

        while (l<r) {
            System.out.println("l val: " + l + "r val: " + r + " CurWater: " + totalWater);
            if (height[l] <= height[r]) {
                int currWater = maxLeft - height[l];
                if (currWater > 0) { totalWater += currWater; }
                if (height[l] > maxLeft ) { maxLeft = height[l]; }
                l++;
            } else {
               int currWater = maxRight - height[r];
               if (currWater > 0) { totalWater += currWater; }
               if (height[r] > maxRight ) { maxRight = height[r]; }
                r--;
            }
        }

        System.out.println("l val: " + l + "r val: " + r + " CurWater: " + totalWater);

        return totalWater;
    }
}
