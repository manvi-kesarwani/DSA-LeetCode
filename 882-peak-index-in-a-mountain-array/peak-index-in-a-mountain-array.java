class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int peak_val=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++){
        if(arr[i]>max){
            max=arr[i];
            peak_val=i;
        }

        }
        return peak_val;
        
    }
}