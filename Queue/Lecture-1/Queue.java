import java.util.*;
import java.io.*;

public class Queue {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node front, rear;

    Queue() {
        this.front = null;
        this.rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = rear = newNode; 
        } else {
            rear.next = newNode;    
            rear = newNode;        
        }
    }

    int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int val = front.data;
        front = front.next;
        
        return val;
    }

    int front() {
        if (isEmpty()) {
            return -1;
        }
        return front.data;
    }
}
