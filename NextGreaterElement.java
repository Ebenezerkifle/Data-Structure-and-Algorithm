class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length; i++){
            for(int j=0;j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    int nextG=-1;
                    j++;
                    while(j < nums2.length){
                        if(nums1[i]<nums2[j]){
                            nextG=nums2[j];
                            j=nums2.length;
                            break;
                        }
                        j++;
                    }
                    ans[i]=nextG;
                }
            }
        }
        return ans;
    }
}
