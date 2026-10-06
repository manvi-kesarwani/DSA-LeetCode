class Solution {
    public int trap(int[] height) {
        int n=height.length;
            //left most boundary array
            int LMB[]=new int[n];
             LMB[0]=height[0];
            for(int i=1;i<n;i++){
            LMB[i]=Math.max(LMB[i-1],height[i]);
    }
    // right most boundary
    int RMB[]=new int[n];
     RMB[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
        RMB[i]=Math.max(RMB[i+1],height[i]);
    }
    int trapped_water=0;
    for(int i=0;i<n;i++){
    int water_level=Math.min(LMB[i],RMB[i]);
    trapped_water+=water_level-height[i];
    }
    return trapped_water;
}}