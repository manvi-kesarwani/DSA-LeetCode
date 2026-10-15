class Solution {
    public void reverseString(char[] arr) {
        int n=arr.length;
        int start=0;
        int end=n-1;
        char temp=0;
        for(int  i=start;i<=end;i++){
              temp=arr[start];
              arr[start]=arr[end];
              arr[end]=temp;
               start++;
               end--;
        }
       
        
    }
}