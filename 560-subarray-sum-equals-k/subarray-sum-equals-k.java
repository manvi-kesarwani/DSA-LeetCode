class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        int count=0;
        HashMap <Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            int m=nums[i]-k;
            if(hm.containsKey(m)){
            count+=hm.get(m);
        }
        hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
        }
        return count;

    }
}