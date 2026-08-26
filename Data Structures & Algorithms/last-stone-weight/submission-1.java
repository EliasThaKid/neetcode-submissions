class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stoney = new PriorityQueue<>(Collections.reverseOrder());
        int res = 0;
        for (int stone : stones) {
            stoney.offer(stone);
        }

        while (stoney.size() > 1) {
            int stone1 = stoney.poll();
            int stone2 = stoney.poll();

            if (stone1 - stone2 > 0) {
                stoney.offer(stone1 - stone2);
            }
        }

        
        return stoney.isEmpty() ? 0 : stoney.poll();
    }
}
