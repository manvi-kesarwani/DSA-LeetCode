class Solution {
    public boolean checkOnesSegment(String s) {
        int n=s.length();
        for(int i=0;i<=n;i++){
           if(s.contains("01")){
            return false;
            }}
            return true;
    }
}