class Solution {
    public boolean isPowerOfFour(int n) {

        boolean result=false;
        if(n==1) return true;
        while(n % 4 == 0 && n>=4 ){
            n=n/4;
            if(n==1){
                result=true;
            }
        }
        
        return result;
    }
}
