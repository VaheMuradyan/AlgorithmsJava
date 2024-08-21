import java.util.Stack;

public class MaxStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> maxValues = new Stack<>();

    public void push(int x) {
        // implement this
        if (maxValues.isEmpty() || x > maxValues.peek()){
            maxValues.push(x);
        }
        stack.push(x);
    }
    
    public void pop() {
        // implement this
        if(!stack.isEmpty() && stack.peek().equals(maxValues.peek())){
            maxValues.pop();
        }
        
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    
    public int top() {
        return stack.isEmpty() ? -1 : stack.peek();
    }
    
    public int getMax() {
        // implement this
        return maxValues.isEmpty() ? -1 : maxValues.peek();
    }

    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();
        maxStack.push(-2);
        maxStack.push(0);
        maxStack.push(-3);
        System.out.println(maxStack.getMax());  // Expected Output: 0
        maxStack.pop();
        System.out.println(maxStack.top());    // Expected Output: 0
        System.out.println(maxStack.getMax());  // Expected Output: 0

        maxStack.push(10);
        System.out.println(maxStack.getMax());  // Expected Output: 10
        maxStack.push(-1);
        System.out.println(maxStack.getMax());  // Expected Output: 10
    }
    
}
