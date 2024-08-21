class Solution {
    static class Queue {
        int front, rear, capacity;
        int[] elements;
        
        public Queue(int capacity) {
            this.capacity = capacity;
            elements = new int[this.capacity];
            front = 0;
            rear = 0;
        }
        
        // Adds an element to the rear of the queue
        public void enqueue(int element) {
            // Check if queue is not full
            // TODO: If not full, add element to the queue and adjust the rear
            
        }
        
        // Removes and returns an element from the front of the queue
        public int dequeue() {
            // Check if queue is not empty
            // TODO: If not empty, return the front element and move the front forward
            
            return -1; // Placeholder return value to indicate queue is empty (remove when implementing)
            
        }
    }
    
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        // TODO: Use dequeue method to remove and display the visitor taking the ride
    }
        
}