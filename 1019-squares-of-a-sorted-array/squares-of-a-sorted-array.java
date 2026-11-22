class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=nums[i]*nums[i];
            Arrays.sort(arr);
        }
        return arr;
    }
}