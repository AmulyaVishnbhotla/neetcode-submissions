class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] prefix = new int[n];
        int[] answer = new int[n];
        int product = 1;

        for(int i=0;i<n;i++){
           prefix[i] = product;
           product*=nums[i];
        }

        int suffix = 1;
        for(int j=n-1;j>=0;j--){
            answer[j] = prefix[j]*suffix;
            suffix*=nums[j];
        }

        return answer;
    }
}  
