class Solution {
    public int busyStudent(int[] st, int[] et, int queryTime) {
        int n=st.length;
        int count=0;
        for(int i=0;i<n;i++){
        if(st[i]<=queryTime && et[i]>=queryTime){
            count++;
        }
        }
        return count;
        
    }
}