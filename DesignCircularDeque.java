class MyCircularDeque {
    private Queue<Integer> queue;
    int maxSize;

    public MyCircularDeque(int k) {
        this.queue= new LinkedList<Integer>();
        this.maxSize=k;
    }

    public boolean insertFront(int value) {
        if( !this.isFull()){
            Queue<Integer> temp= new LinkedList<Integer>();
            temp.addAll(this.queue);
            this.queue.clear();
            this.queue.add(value);
            this.queue.addAll(temp);
            return true;
        }
        else return false;
    }

    public boolean insertLast(int value) {
        if(!this.isFull()){
            return this.queue.add(value);
        }
        else return false;
    }

    public boolean deleteFront() {
        if(!queue.isEmpty()){
            int value=queue.peek();
            return value == this.queue.remove();
        }
        return false;
    }

    public boolean deleteLast() {
        if(!this.queue.isEmpty()){
        Stack<Integer> stack = new Stack<Integer>();
        stack.addAll(this.queue);
        int size=stack.size();
        stack.pop();
        this.queue.clear();
        this.queue.addAll(stack);
        if(size-1==stack.size()){
            stack.clear();
            return true;
        }
        else return false;
        }
    else return false;
    }
    

    public int getFront() {
        if(!queue.isEmpty()){
            return queue.peek();
        }
        else return -1;
    }

    public int getRear() {
        if(!queue.isEmpty()){
            Stack<Integer> stack = new Stack<>();
            stack.addAll(this.queue);
            return stack.peek();
        }
        else return -1;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean isFull() {
        if(queue.size()<maxSize){
            return false;
        }
        else return true;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
