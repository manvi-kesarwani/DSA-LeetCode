class Solution {
    public int countPrimes(int n) {
        int count=0;
        if(n<=2){
            return 0;
        }
        boolean prime_arr[]=new boolean[n];
        Arrays.fill(prime_arr,true);
        for(int i=2;i<n;i++){
        if(prime_arr[i]){
            count++;
        for(int j=i*2;j<n;j+=i){
        prime_arr[j]=false;
            }
        }
        }
          return count;
    }
}