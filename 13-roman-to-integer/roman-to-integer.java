class Solution {
    public int number(char ch){
          switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:  return 0;
        }
    }
    public int romanToInt(String s) {
        int rom=0;
        int n=s.length();
        for(int i=0;i<n-1;i++){
            int prev=number(s.charAt(i));
            int next=number(s.charAt(i+1));
            if(prev<next){
                rom-=prev;
            }
            else{
                rom+=prev;
            }
         }
         rom+= number(s.charAt(n - 1));
         return rom;

    }
}