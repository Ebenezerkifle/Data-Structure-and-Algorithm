class Solution {
    public void moveZeroes(int[] nums) {
        
       int pointer1=nums.length-1;
       int pointer2=nums.length-1;
       while(pointer1>=0){
           if(nums[pointer1]==0 && pointer1!=pointer2){
               int temp=pointer1;
               while(pointer2>temp){
                 nums[temp]=nums[temp+1];
                 temp++;
               }
               nums[pointer2]=0;
               pointer2--;
           }
           else{
               pointer1--;
           }
       }
    }
}
