class KthLargest {
    int k;
    int[] nums;
    PriorityQueue<Integer> minHeap;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        this.minHeap = new PriorityQueue<>();

        for (int i = 0; i <nums.length; i++) {
            minHeap.add(nums[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
    }

    public int add(int val) {
        minHeap.add(val);
        
       if(minHeap.size() > k)
            minHeap.poll();
        return minHeap.peek();
    }
}
