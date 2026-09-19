class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int tmp = target-nums[i];
            if(result.containsKey(tmp)){
                return new int[] {result.get(tmp),i};
            }
            result.put(nums[i],i);
        }

        return new int[]{};
    }
}
