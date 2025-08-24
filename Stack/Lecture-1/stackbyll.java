package Stack;
/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * static class Node
 * {
 * int data;
 * Node next;
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * }
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * Node(int data, Node next)
 * {
 * this.data = data;
 * this.next = next;
 * }
 * };
 * 
 * 
 *****************************************************************/
public class Solution {
    static class Stack {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node top;
        private int size;

        Stack() {
            top = null;
            size = 0;

        }

        int getSize() {
            return size;

        }

        boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;

        }

        void push(int data) {
            Node newNode = new Node(data);

            newNode.next = top;
            top = newNode;
            size++;

        }

        void pop() {
            if (isEmpty()) {
                return;
            }
            top = top.next;
            size--;

        }

        int getTop() {
            if (isEmpty()) {
                return -1;
            }
            return top.data;

        }
    }
}
