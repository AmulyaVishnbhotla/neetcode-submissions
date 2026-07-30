class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        subSets(nums,0,ans,target, new ArrayList<Integer>());
        return ans;
        
    }

    public void subSets(int[] nums, int ind, List<List<Integer>> ans,int target, List<Integer> tmp){
        if(target == 0){
            ans.add(new ArrayList<>(tmp));
            return;
        }

        if(ind>=nums.length || target < 0) return;

        tmp.add(nums[ind]);
        subSets(nums,ind,ans,target-nums[ind],tmp);
        tmp.remove(tmp.size()-1);
        subSets(nums,ind+1,ans,target,tmp);
    }


}
