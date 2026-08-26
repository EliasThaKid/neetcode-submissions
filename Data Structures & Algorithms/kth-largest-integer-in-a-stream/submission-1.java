class KthLargest {
    public int kth;
    public PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public KthLargest(int k, int[] nums) {
        kth = k;

        for (int num : nums) {
            maxHeap.add(num);
        }
    }
    
    public int add(int val) {
        maxHeap.add(val);
        int res = 0;
        Queue<Integer> topElements = new LinkedList<>();
        
        for (int i = 0; i < kth; i++) {
            res = maxHeap.poll();
            topElements.add(res);
        }


        int listsize = topElements.size();
        for (int i = 0; i < listsize; i++) {
            maxHeap.add(topElements.poll());
        }

        return res;
    }
}
