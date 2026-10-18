class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        int GCD=Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++){
            smallest=Math.min(nums[i],smallest);
            largest=Math.max(nums[i],largest);
        }
        for(int i=1;i<=smallest;i++){
        if(smallest %i==0 && largest%i==0){
            GCD=Math.max(GCD,i);
        }
        }
        return GCD;
      
    }
}