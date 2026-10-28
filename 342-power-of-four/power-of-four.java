class Solution {
    public boolean isPowerOfFour(int n) {
          if(n==1){
            return true;
        }
        if(n>0 && (n & (n - 1))== 0){
            if(n%3==1){
            return true;
        }}
        return false;
        
    }
}