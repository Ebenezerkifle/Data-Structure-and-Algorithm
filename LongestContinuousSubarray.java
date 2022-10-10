class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int result=0;
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min=new PriorityQueue<>();
        int initIndex=0;
        int endeIndex=0;
        for(int i=0;i<nums.length; i++){
           max.add(nums[i]);
           min.add(nums[i]);
           if(max.peek() - min.peek() > limit){
              while(max.peek()-min.peek() >limit){
                  max.remove(nums[initIndex]);
                  min.remove(nums[initIndex]);
                  initIndex++;
              }   
              
           }
           else{
               result=Math.max(result, i-initIndex+1);
           }
        } 
        return result;
    }
}
