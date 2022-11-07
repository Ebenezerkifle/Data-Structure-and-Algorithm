class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0, count=0;
        int index;
        for(index=0; index<k; index++) sum+=arr[index];
        if(sum/k>=threshold) count++;
        
        while(index<arr.length){
            sum= sum - arr[index-k]+ arr[index];
            if(sum/k>= threshold) count++;
            index++;
        }
        
        return count;
    }
}
