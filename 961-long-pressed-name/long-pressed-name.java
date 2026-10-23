class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] char_name = name.toCharArray();
        char[] char_typed = typed.toCharArray();
        int n=char_name.length;
        int m=char_typed.length;
        int i=0;
        int j=0;
        while(j<m ){
                if(i<n && char_name[i]==char_typed[j]){
                    i++;
                    j++;
                }
                else if( j>0 && char_typed[j]==char_typed[j-1]){
                    j++;
             }
                else{
                 return false;
             
        }}
         return i == n;
        
    }
}