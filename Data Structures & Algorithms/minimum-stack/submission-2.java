class MinStack {

    Stack<Integer> stack;
    Stack<Integer>Minstack;

    public MinStack() {
        stack = new Stack<>();
        Minstack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if(Minstack.isEmpty() || Minstack.peek() >= val){
            Minstack.push(val);
        }
        else{
            Minstack.push(Minstack.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        Minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return Minstack.peek();
    }
}
