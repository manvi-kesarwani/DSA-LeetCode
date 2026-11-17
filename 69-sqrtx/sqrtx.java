class Solution {
    public int mySqrt(int x) {
        long n=Integer.MAX_VALUE;
        long st=0;
        long end=n/2;
        long mid=0;
        long ans=0;
        if(x==0 || x==1){
            return x;
        }
        while(st<=end){
             mid=st+(end-st)/2;
            if(mid*mid==x){
                return (int) mid;
            }
            else if(mid*mid<=x){
                ans=mid;
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int ) ans;
    }
}