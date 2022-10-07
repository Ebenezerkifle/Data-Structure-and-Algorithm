class MinStack {
    private Stack<Integer> minStack;

    public MinStack() {
       this.minStack=new Stack<Integer>(); 
    }
    
    public void push(int val) {
        this.minStack.push(val);
    }
    
    public void pop() {
        this.minStack.pop();
    }
    
    public int top() {
        return this.minStack.peek();  
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(Integer element: this.minStack){
            if(element < min ){
                min=element;
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
