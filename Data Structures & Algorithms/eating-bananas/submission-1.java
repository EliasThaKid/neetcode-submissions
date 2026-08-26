class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxBananaRate = Arrays.stream(piles).max().getAsInt();
        int l = 1;
        int res = maxBananaRate;

        while (l <= maxBananaRate) {
            int mid = (l + maxBananaRate) / 2;

            long totalTime = 0;
            for (int p : piles) {
               totalTime += (p + mid - 1) / mid;
            }

            if (totalTime <= h) {
                res = mid;
                maxBananaRate = mid-1;
            } else {
                l = mid + 1;
            }
        }


        return res;
    }

    
}
