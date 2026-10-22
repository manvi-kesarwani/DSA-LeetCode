class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n=word1.length;
        int m=word2.length;
         String worda = "";
          String wordb = "";
        for(int i=0;i<=n-1;i++){
            worda+=word1[i];
        }
        for(int j=0;j<=m-1;j++){
            wordb+=word2[j];
        }
        if(worda.equals(wordb)){
            return true;
        }
        return false;
    }
}