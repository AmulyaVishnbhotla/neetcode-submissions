class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int k = 2;
        for(int i=0;i<stones.length;i++){
            maxHeap.add(stones[i]);
        }

        while(maxHeap.size() != 1 && !maxHeap.isEmpty()){
            int frst = maxHeap.poll();
            int second = maxHeap.poll();
            if(frst == second){
                continue;
            }else if(second < frst || frst<second){
                maxHeap.add(Math.abs(frst-second));
            }
        }

        if(maxHeap.size() == 1)
            return maxHeap.peek();
        return 0;
    }
}
