class MinStack {

    Stack<Integer> first;
    Stack<Integer> minStack;
    public MinStack() {
        first = new Stack<Integer>();
        minStack  = new Stack<Integer>();
    }
    
    public void push(int val) {
        if(first.size() <= 0){
            first.push(val);
            minStack.push(val);
        } else{
            first.push(val);
            if(val < minStack.peek()){
                minStack.push(val);
            }
            else if(val >= minStack.peek()){
                minStack.push(minStack.peek());
            }
        } 
    }
    
    public void pop() {
        first.pop();
        minStack.pop();
    }
    
    public int top() {
       if(!first.isEmpty()) return first.peek();
       return 0;
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
