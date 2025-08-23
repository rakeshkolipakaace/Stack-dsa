class MyStack {
    private int top;
    private int st[];
    private int n;
    
    MyStack(){
        top=-1;
        st=new int[100];
      n=st.length;
        
    }

    public void push(int x) {
        
        if(top==n-1){
            return  ;
        }
        top++;
        st[top]=x;
        
        
        
        // code here
        
    }

    public int pop() {
        
        if(top<0){
            return -1;
        }
        int val=st[top];
        top--;
        return val;
        // code here
    }
}
