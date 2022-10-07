class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        List<Integer> result = new ArrayList<Integer> (); 
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result.add(i);
            }
        }
        return result;
    }
}
