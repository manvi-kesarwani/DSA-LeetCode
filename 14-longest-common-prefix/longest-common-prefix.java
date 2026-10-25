class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
            int  m = strs[0].length();
            int  o = strs[n-1].length();
            String s="";
            for(int i=0;i<=m-1;i++){
                if(strs[0].charAt(i)==strs[n-1].charAt(i)){
                    s+=strs[0].charAt(i);
                }
                else{
                    break;
                }
                
            }
            return s;
    }
}