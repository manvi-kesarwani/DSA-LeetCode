class Solution {
    public int maxSubArray(int[] nums) {
        
        int n=nums.length;
        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++){
        current_sum+=nums[i];
        if(current_sum<nums[i]){
            current_sum=nums[i];
        }
           
        Math.max(current_sum,max_sum);
        if(current_sum>max_sum){
            max_sum=current_sum;
        }}
        return max_sum;
    }
}