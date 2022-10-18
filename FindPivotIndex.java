class Solution {
    public int pivotIndex(int[] nums) {
        // prefix sum algorithm.
        
        int pivotIndex=-1;
        
        int[] leftSum= new int [nums.length];
        // prefix sum from left to right.
        int[] rightSum= new int [nums.length];
        // prefix sum from right to left.
        
        leftSum[0]=nums[0];
        rightSum[nums.length-1]=nums[nums.length-1];
        // initial value is assigned.
        
       for(int i=1;i<nums.length;i++){
           leftSum[i]=leftSum[i-1]+nums[i];
       }
        // prefix sum one.
        
       for(int j=nums.length-2;j>=0;j--){
           rightSum[j]=rightSum[j+1]+nums[j];
       }
       // prefix sum two.
        
       for(int k=0;k<nums.length;k++){
           //searching for elements that match.
           // which is where we find pivote
           if(leftSum[k]==rightSum[k]){
               pivotIndex=k;
               break;
           }
       }
     return pivotIndex;
    }
}
