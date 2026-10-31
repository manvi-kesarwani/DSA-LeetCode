class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int max_reach=0;
         int jump=0;
        for(int i=0;i<=n-1;i++){
            if(i>max_reach){
                return false;
                }
             jump=i+nums[i];
             max_reach=Math.max(max_reach,jump);
             if(max_reach>=n-1){
                return true;
        }}
        return false;
    }
}