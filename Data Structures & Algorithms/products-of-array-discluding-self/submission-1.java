class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int n = nums.length;

        int prefix = 1;
        for(int i=0;i<n;i++){
            products[i] = prefix;
            prefix = prefix*nums[i];
        }

        int suffix = 1;
        for(int j=n-1;j>=0;j--){
            products[j] = products[j]*suffix;
            suffix=suffix*nums[j];
        }

        return products;
    }
}
