class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // pushed: 1,2,3,4,5
        // popped: 4,5,3,2,1
        
        int j=0; //a pointer to point the possition
                // we are in on popped items.
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<pushed.length; i++){
            stack.push(pushed[i]);
            while(!stack.empty() && j<pushed.length
                && stack.peek()==popped[j]){
                stack.pop();
                j++; 
                // the pointer increases whenever
                // the peek item and the item on pooped array matchs.
            }
        }
        if(stack.empty()){
            return true;
        }
        else return false;
    }
}
