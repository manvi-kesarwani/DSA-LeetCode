class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
        char k=s.charAt(i);
        if(k=='i'){
             sb.reverse();
        }
        else{
             sb.append(k);
        }
        }
        return   sb.toString();
        
    }
}