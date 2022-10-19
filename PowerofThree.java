class Solution {
    public boolean isPowerOfThree(int n) {
        boolean result=false;
        if(n==1) return true;
        while( n % 3 == 0 &&  Math.abs(n) >=3){
            n=n/3;
            if(n==1){
                result=true;
            }
        }
     return result;
    }
}
