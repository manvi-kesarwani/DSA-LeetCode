class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=n-1;i++){
            if(word.charAt(i)!=ch){
                sb.append(word.charAt(i));
                word.substring(i + 1);
            }
            else {
                sb.append(word.charAt(i));
                sb.reverse();
                 sb.append(word.substring(i + 1));
                break;
            }
        }
        
        return sb.toString();
    }
}