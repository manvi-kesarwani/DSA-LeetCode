class Solution {
    public char repeatedCharacter(String s) {
        char[] ch= s.toCharArray();
        int n=ch.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
            if(ch[i]==ch[j]){
                return ch[i];
            }
            }
        }
        return ' ';
        
    }
}