class Solution {
    public long maxAlternatingSum(int[] nums){
        int n=nums.length;
        long small_sum=0;
        long large_sum=0;
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=nums[i]*nums[i];
            }
             Arrays.sort(arr);
             for(int i=0;i<=n-1;i++){
                if(i<n/2){
                    small_sum+=arr[i];
                }
                else{
                    large_sum+=arr[i];
                }}
                long sum=large_sum-small_sum;
                return sum ;
    }
}