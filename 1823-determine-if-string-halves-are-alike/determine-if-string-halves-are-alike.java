class Solution {
    public boolean halvesAreAlike(String ch) {
        int n=ch.length();
        int left_half=0;
        int right_half=0;
        for(int i=0;i<n/2;i++){
            if(ch.charAt(i)=='a'|| ch.charAt(i)=='e'||ch.charAt(i)=='i'||ch.charAt(i)=='o'||ch.charAt(i)=='u'||ch.charAt(i)=='A'|| ch.charAt(i)=='E'||ch.charAt(i)=='I'||ch.charAt(i)=='O'||ch.charAt(i)=='U'){
                left_half++;
            }
        }
        for(int j=n/2;j<=n-1;j++){
              if(ch.charAt(j)=='a'|| ch.charAt(j)=='e'||ch.charAt(j)=='i'||ch.charAt(j)=='o'||ch.charAt(j)=='u'||ch.charAt(j)=='A'|| ch.charAt(j)=='E'||ch.charAt(j)=='I'||ch.charAt(j)=='O'||ch.charAt(j)=='U'){
                right_half++;
              }
        }
        if(left_half==right_half){
            return true;
        }
        return false;
     
    }
}