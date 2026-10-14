class Solution {
    public String maxSumOfSquares(int num, int sum) {
      StringBuilder sb=new StringBuilder(num);
      if(sum<1 || sum>num*9){
        return "";
      }
      for(int i=1;i<=num;i++){
        int remaining_spot=num-i;
        for(int j=9;j>=0;j--){
            if(sum-j>=0 && sum-j<=remaining_spot*9){
            sb.append(j);
            sum-=j;
            break;}
        }
      }
      return sb.toString();

       
    }
}