class Solution {
    public int furthestDistanceFromOrigin(String m) {
        int n=m.length();
        int cl=0;
        int cr=0;
        int cd=0;
        for(int i=0;i<n;i++){
            if(m.charAt(i)=='L'){
                cl++;
            }
             else if(m.charAt(i)=='R'){
                cr++;
             }
             else{
                cd++;
             }
        
    
        }
         int k=Math.abs(cl-cr);
         return cd+k;
    }
}