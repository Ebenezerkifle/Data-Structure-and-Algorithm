class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequency= new int[26];
         int maxFreq=0;
         int numOfChar=1;
         for(char task: tasks){
             frequency[task - 'A']++;
             if(frequency[task -'A'] > maxFreq){
                 maxFreq=frequency[task -'A'];
                  numOfChar=1;
             }
             else if(frequency[task -'A']==maxFreq){
                 numOfChar++;
             }
         }
        int partCount = maxFreq - 1;
        int partLength = n - (numOfChar - 1);
        int empty = partCount * partLength;
        int available = tasks.length - maxFreq * numOfChar;
        int idle = Math.max(0, empty - available);
         return tasks.length + idle;
    }
}
