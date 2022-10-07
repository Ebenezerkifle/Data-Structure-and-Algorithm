class MyQueue {
    
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
      this.stack1 = new Stack<Integer>();
      this.stack2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        this.stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int value=stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return value;
    }
    
    public int peek() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int value=stack2.peek();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return value;
    }
    
    public boolean empty() {
        return stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
