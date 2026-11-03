class Solution {
    public int subarraysDivByK(int[] nums, int k) {
         int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        int count=0;
        HashMap <Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            int rem = (nums[i]%k+k)%k;
            if(hm.containsKey(rem)){
            count+=hm.get(rem);
        }
        hm.put(rem,hm.getOrDefault(rem, 0)+1);
        }
        return count;
    }
}