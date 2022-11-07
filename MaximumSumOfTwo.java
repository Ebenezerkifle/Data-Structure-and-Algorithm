class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int length=nums.length;
        int sum1=0, sum2=0, index1=0, index2=length-1, maxSum=0, sum3=0, index3=0;

        while(index1<firstLen){
            sum1+=nums[index1];
            index1++;
        }
        while(length-index2-1<secondLen){
            sum2+=nums[index2];
            index2--;
        }
        while(index3<secondLen){
            sum3+=nums[index3];
            index3++;
        }
        while(index1<length){
            if(index2>=index1-1){
                maxSum=Math.max(maxSum, sum1+sum2);
                int sum=sum2;
                while(index2>=index1){
                    sum=sum-nums[index2+secondLen]+nums[index2];
                    maxSum=Math.max(maxSum, sum1+sum);
                    index2--;
                }
                index2=length-secondLen-1;
            }
            sum1=sum1-nums[index1-firstLen]+nums[index1];
            if(index3<=index1-firstLen){
                maxSum=Math.max(maxSum, sum1+sum3);
                int sum33=sum3;
                while(index3<index1-firstLen){
                    sum33=sum33-nums[index3-secondLen]+nums[index3];
                    maxSum=Math.max(maxSum, sum1+sum33);
                    index3++;
                }
                index3=secondLen;
            }
            index1++;
        }
        return maxSum;
    }
}
