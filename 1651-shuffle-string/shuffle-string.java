class Solution {
    public String restoreString(String s, int [] indices) {
        int n=indices.length;
        char ch[]=new char[n];
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=n-1;j++){
                if(j==indices[i]){
                ch[j]=s.charAt(i);
                }
            }
        }
        return new String(ch);

       
    }
}