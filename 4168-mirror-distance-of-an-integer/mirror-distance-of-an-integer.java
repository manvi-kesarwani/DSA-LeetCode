class Solution {
    public int rev(int n){
        int rev =0;
        int temp=n;
        while(n!=0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return rev;}
        public int mirrorDistance(int n) {
        int mirror=Math.abs(n-rev(n));
        return mirror;
    }
} 