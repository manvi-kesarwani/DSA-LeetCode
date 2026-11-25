class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] arr = s.toCharArray();
        int n = arr.length;
        int max = 0;
        for (int i=0;i<n;i++) {
            int count = 1;
            for (int j=i+1;j<n;j++) {
                boolean duplicate = false;
                for (int k = i; k < j; k++) {
                    if (arr[k] == arr[j]) {
                        duplicate = true;
                        break;
                    }
                }
                if (duplicate) {
                    break;
                }
                count++;
            }
            if (count>max) {
                max=count;
            }
        }
        return max;
    }
}