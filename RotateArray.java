class Solution {
    public void rotate(int[] nums, int k) {
       while(k>nums.length) k=k-nums.length;
        // the k value should always be lessthan array length.
        
        int[] arr=new int[k];
        
        // we are copying k elements from the array
        for(int i=0;i<k;i++){
            arr[i]=nums[nums.length-k+i];
        }
        
        int temp=nums.length-k-1;
        // an index point to un moved elements.
        int pointer2=nums.length-1;
        // points to the last index of array.initially!
        while(temp>=0){
            nums[pointer2]=nums[temp];
            temp--;
            pointer2--;
        }
        System.arraycopy(arr, 0, nums, 0, k);
    }
}
