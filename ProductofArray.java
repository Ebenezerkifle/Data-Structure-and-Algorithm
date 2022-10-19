class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int zeroCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeroCount++;
            else product=product*nums[i];
        }
        if(zeroCount == 0){
         for(int j=0;j<nums.length;j++)
            nums[j]=product/nums[j];      
        }
        else if(zeroCount == 1){
            for(int k=0;k<nums.length;k++){
                if(nums[k]==0) nums[k]=product;
                else nums[k]=0;
            }
        }
        else{
            for(int l=0;l<nums.length; l++){
                nums[l]=0;
            }
        }
        return nums;
    }
}
