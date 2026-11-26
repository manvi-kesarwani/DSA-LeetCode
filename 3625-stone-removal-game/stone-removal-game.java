class Solution {
    public boolean canAliceWin(int n) {
        int count=0;
        for(int i=10;i>=0;i--){
            if(n>=i){
                n=n-i;
                count++;
            }
            else
            {
                break;
            }
        }
        if( count%2==0){
            return false;
        }
        return true;
    }
}