class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int windowSize = k;
        
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i - left + 1);
            if (i - left + 1 == k) {
                int max = Integer.MIN_VALUE;
                System.out.println("indexing in the mini array");
                for (int j = left; j <= i; j++) {
                    if (nums[j] > max) { max = nums[j]; }
                    System.out.print(nums[j] + ", ");
                }
                System.out.println(" ");
                res.add(max);
                left++;
            }
        }

        int[] retRes = new int[res.size()];

        for (int i = 0; i < retRes.length; i++) {
            retRes[i] = res.get(i);
        }

        return retRes;    
    }
}
