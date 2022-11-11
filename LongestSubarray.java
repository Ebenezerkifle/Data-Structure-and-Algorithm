class Solution {
    public int longestSubarray(int[] nums) {
        List<Integer> list= new ArrayList<>();
        list.add(-1);
        for(int i=0 ; i<nums.length; i++){
            if(nums[i]==0) list.add(i);
        }
        list.add(nums.length);
        if(list.size()==2) return nums.length-1;
        int maxLength=0;
        int index=0;
        for(int j=1; j<list.size()-1;j++){
           maxLength=Math.max(list.get(j+1)-list.get(j-1)-2, maxLength);
        }
        return maxLength;
    }
}
