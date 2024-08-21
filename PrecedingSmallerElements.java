import java.util.Stack;

public class PrecedingSmallerElements {
    public static int[] findPrecedingSmallerElements(int[] arr) {

        int[] result = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]) {

                stack.pop();

            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);

        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 4, 5, 3};
        int[] result = findPrecedingSmallerElements(arr);
        for (int n : result) {
            System.out.print(n + " ");
        }
        // Output: -1 3 -1 1 1 1
    }
    
}
