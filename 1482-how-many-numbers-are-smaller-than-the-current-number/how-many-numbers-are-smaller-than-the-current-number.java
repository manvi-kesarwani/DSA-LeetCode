class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int n=nums.length;
        // // int count=0;
        //     for(int i=0;i<n-1;i++){
        //         for(int j=i+1;j<n-1;j++){
        //             // while(j!=i){
        //             if(nums[j]<nums[i]){
        //                 // count=count+nums[j];
        //                 return new int[] {nums[j]};
        //             }
        //     }
        // }
        // return new int[] {}; 
        
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
             int count=0;
            for(int j=0;j<n;j++){
                if(j!=i){
                if(nums[j]<nums[i]){
                    // count=nums[j];
                    count++;
                     }
            }
            ans[i] = count;
            
            }
        }
        return ans;
    }
}