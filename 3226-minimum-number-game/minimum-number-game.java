class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int alice[]=new int[n];
        int bob[]=new int[n];
        int arr[]=new int[n];
        for(int i=0;i<n;i+=2){
            alice[i]=nums[i];
            bob[i]=nums[i+1];
            arr[i]=bob[i];
            arr[i+1]=alice[i];
        }
        return arr;
        
    }
}