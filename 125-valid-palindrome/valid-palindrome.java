class Solution {
    public boolean isPalindrome(String s) {
        String st=s.toLowerCase();
        String sorted = st.replaceAll("[^a-z0-9]", "");
        int n=sorted.length();
        if (sorted == null || sorted.isEmpty()) {
             return true; 
}
        for(int i=0;i<=n-1;i++){
            if(sorted.charAt(i)!=sorted.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}