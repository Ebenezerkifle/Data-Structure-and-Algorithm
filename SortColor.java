class Solution {
    public void sortColors(int[] nums) {
        for(int i=1;i<nums.length; i++){
            for(int j=1;j<nums.length-i+1; j++){
                if(nums[j-1]>nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}
