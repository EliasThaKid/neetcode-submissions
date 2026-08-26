class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = Arrays.stream(piles).max().getAsInt();
        int minRate = right;

        while (left <= right) {
            int mid = (left + right) / 2;

            int totalTime = 0;
            for (int p : piles) {
                totalTime += (p + mid - 1) / mid; // Equivalent to Math.ceil(p / (double) mid)
            }

            if (totalTime <= h) {
                minRate = mid; // mid is the possible minimum eating speed
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return minRate;
    }
}
