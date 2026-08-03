class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);

        combinationSums(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }

    public void combinationSums(
        int[] candidates, int i, int target, List<Integer> arrLst, List<List<Integer>> res) {
        if (target < 0)
            return;

        if (target == 0) {
            res.add(new ArrayList<>(arrLst));
            return;
        }

        // take i
        for (int k = i; k < candidates.length; k++) {
            if (k > i && candidates[k] == candidates[k - 1])
                continue;
            arrLst.add(candidates[k]);
            combinationSums(candidates, k+1, target - candidates[k], arrLst, res);
            arrLst.remove(arrLst.size()-1);

            if(target-candidates[k] < 0)
                break;
        }
    }
}
