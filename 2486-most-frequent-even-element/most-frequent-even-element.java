class Solution {
public int mostFrequentEven(int[] arr) {
Arrays.sort(arr);
int n = arr.length;
int curr_freq = 1;
int max_freq = 0;
int result = -1;
    for (int i=0;i<n-1;i++) {
        if (arr[i] % 2 == 0) {
            if (arr[i] == arr[i + 1]) {
                curr_freq++;
            } 
            else {
                if (curr_freq>max_freq) {
                    max_freq=curr_freq;
                    result=arr[i];
                }
                curr_freq=1;
            }
        } 
        else{
            curr_freq=1;
        }
    }

    if (n > 0 && arr[n - 1] % 2 == 0) {
        if (n == 1||arr[n - 1] != arr[n - 2]) {
            curr_freq = 1;
        }

        if (curr_freq>max_freq) {
            max_freq=curr_freq;
            result=arr[n-1];
        }
    }
    return result;
}


}
