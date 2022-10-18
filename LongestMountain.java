class Solution {
    public int longestMountain(int[] arr) {
        int maxLength=0;
        //arr.length>=3;
        if(arr.length>=3){
            for(int i=1;i<arr.length-1;i++){
                // a loop to get the index of centeral value.
                // like 7 for 2,1,4,7,3,2,5.
                if(arr[i-1] < arr[i] && arr[i]>arr[i+1]){
                    // whenever we find a value which is greater than
                    // its left and right elements.
                    
                    int leftPointer=i-1;
                    int rightPointer=i+1;
                    // pointeres to the right and left of centeral value.
                    int length=3;
                    // length stores the length of mountan value.
                    // initially it is 3 since we aready have three elements.
                    
                    // a loop to search for left elements. 
                    while( leftPointer>0 && 
                          arr[leftPointer]>arr[leftPointer-1]){
                        length++;
                        leftPointer--;
                    }
                    
                    // a loop to search for left elements. 
                    while( rightPointer<arr.length-1 && 
                          arr[rightPointer]>arr[rightPointer + 1]){
                        length++;
                        rightPointer++;
                    }
                    if(maxLength<length){
                        maxLength=length;
                        // max length get updated whenever there is max value.
                    }
                }
            }
        }
        return maxLength;
    }
}
