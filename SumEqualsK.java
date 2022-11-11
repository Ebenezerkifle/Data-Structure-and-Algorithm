class Solution {
    public int subarraySum(int[] nums, int k) {
       //prefix sum
       int sum=0, count=0;
       int[] sums=new int[nums.length+1];
        sums[0]=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            sums[i+1]=sum;
        }
        
        for( int j=0; j<nums.length; j++){
            int currSum=sums[j];
            for(int l=j; l<nums.length; l++){
                int temp= sums[l+1]-currSum;
                if(temp==k){
                    count++;
                }
            }
        }
        return count;
    }
}
