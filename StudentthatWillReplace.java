class Solution {
    public int chalkReplacer(int[] chalk, int k) {
       long sum=0;
       // stores the sum of chalks used on a sinle itration.
        
        for(int i=0; i< chalk.length; i++){
            sum+=chalk[i];
        }
        
        // The total number of chalks should be reduced
        // until it gets lessthan sum.
        long l= k % sum;
     
        // now I have 0 <= l < sum number of chalks.
        int index; 
        // a variable to iterate through students to find...
        for(index=0; index<chalk.length; index++){
            if(l>=chalk[index]){
                l-=chalk[index];
            }
            else return index;
        }
        
        return -1;
    }
}
