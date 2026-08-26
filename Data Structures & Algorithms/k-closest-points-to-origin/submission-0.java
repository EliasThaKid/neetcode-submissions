class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //min heap of the distances 
        //have the heap store the dist as first val, then index as 
        //second val, then listify all the vals type shiii

        PriorityQueue<int[]> heapy = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int distance = x * x + y * y;
            // double distance = Math.sqrt(distanceSquared);
            
            heapy.offer(new int[]{distance, i});
        }

        int[][] res = new int[k][2];

        for (int i = 0; i < k; i++) {
            int[] heapres = heapy.poll();
            res[i] = points[heapres[1]];
        }

        return res;


    }
}
