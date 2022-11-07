class Solution {
    public int longestOnes(int[] nums, int k) {
   int index1=0;
        int index2=0;
        while(k>=0 && index2<nums.length){
            if(k==0 && nums[index2]==0){
                break;
            }
            else if(nums[index2]==0) k--;
            index2++;
        }
        int maxLength=index2; // initial length
        while(index2<nums.length){
            while(nums[index1]==1) index1++;
            if(nums[index1]==0) {
                index1++;
                k++;
            }
            while(k>=0 && index2<nums.length){
                if(k==0 && nums[index2]==0){
                    break;
                }
                else if(nums[index2]==0) k--;
                index2++;
            }
            maxLength=Math.max(maxLength, index2-index1);
        }
        return maxLength;
    }
}
