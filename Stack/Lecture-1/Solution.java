package Stack;
class MyStack {
    private int top;
    private int st[];
    private int n;

    MyStack() {
        top = -1;
        st = new int[100];
        n = st.length;

    }

    public void push(int x) {

        if (top == n - 1) {
            return;
        }
        top++;
        st[top] = x;

        // code here

    }

    public int pop() {

        if (top < 0) {
            return -1;
        }
        int val = st[top];
        top--;
        return val;
        // code here
    }
}

// code 360

public class Solution {
    static class Stack {
        private int top, n;
        private int st[];

        Stack(int capacity) {
            top = -1;
            st = new int[capacity];
            n = st.length;
            // Write your code here.
        }

        public void push(int num) {
            if (top == n - 1) {
                return;
            }

            top++;
            st[top] = num;

            // Write your code here.
        }

        public int pop() {
            if (top < 0) {
                return -1;
            }

            int val = st[top];
            top--;
            return val;
            // Write your code here.
        }

        public int top() {
            if (top < 0) {
                return -1;
            }
            return st[top];
            // Write your code here.
        }

        public int isEmpty() {
            if (top == -1) {
                return 1;
            }
            return 0;
            // Write your code here.
        }

        public int isFull() {
            if (top == n - 1) {
                return 1;
            }
            return 0;
            // Write your code here.
        }
    }
}