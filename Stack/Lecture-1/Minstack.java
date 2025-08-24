class MinStack {
    Stack <Integer> st= new Stack<> ();
    Stack <Integer> min= new Stack();


    public MinStack() {

        
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            min.push(val);
            
        }
        else{
            st.push(val);
            if(min.peek()<val ) min.push(min.peek());
            else min.push(val);
        }

        
        
    }
    
    public void pop() {
        st.pop();
        min.pop();
        
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        

    }
}


//optimal way



class MinStack {
    private Stack<Integer> st = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public MinStack() {}

    public void push(int val) {
        st.push(val);
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
    }

    public void pop() {
        if (st.isEmpty()) return; 
        int removed = st.pop();
        if (removed == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        if (st.isEmpty()) throw new RuntimeException("Stack is empty");
        return st.peek();
    }

    public int getMin() {
        if (min.isEmpty()) throw new RuntimeException("Stack is empty");
        return min.peek();
    }
}
