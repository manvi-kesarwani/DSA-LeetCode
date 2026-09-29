class Solution {
    public int countCommas(int n){
        if(n<1000){
            return 0;
        }
        Math.max(0,n-999);
        return n-999;

    }
}