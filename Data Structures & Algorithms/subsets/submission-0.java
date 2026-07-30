class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> sol = new ArrayList<>();

        printPerms(nums,0,sol, new ArrayList<>());

        return sol;

    }

    public void printPerms(int[] nums, int ind, List<List<Integer>> sol, List<Integer> ans){
        if(ind == nums.length){
            sol.add(new ArrayList<>(ans));
            return;
        }

        //pick
        ans.add(nums[ind]);
        printPerms(nums,ind+1,sol,ans);

        //remove
        ans.remove(ans.size()-1);

        //don't pick

        printPerms(nums,ind+1,sol,ans);
    }
}
