class Solution {
    public int subarraySum(int[] nums, int k) {
        int totalCount=0;
        for(int i=0; i<nums.length; i++){
            int tempPointer=i+1;
            int sum=nums[i];
            if(sum==k){
                totalCount++;
            }
            while(tempPointer<nums.length){
                sum+=nums[tempPointer];
                if(sum==k){
                    totalCount++;
                    break;
                }
                tempPointer++;
            }
        }
        return totalCount;
        
    }
}
