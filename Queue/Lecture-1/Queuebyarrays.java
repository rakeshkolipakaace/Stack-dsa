class MyQueue {

    int front, rear,size,len;
    int arr[];

    MyQueue() {
        len=100005;
        front = 0;
        rear = 0;
        size=0;
        arr=new int[len];
    }

    // Function to push an element x in a queue.
    void push(int x) {
        
        if(size==arr.length){
            return ;
        }
        arr[rear]=x;
        rear=(rear+1)%len;
        size++;
        // Your code here
        
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        
        if(size==0){
            return -1;
        }
        int val=arr[front];
        
        front=(front+1)%len;
        size--;
        return val;
        
        
        // Your code here
    }
}