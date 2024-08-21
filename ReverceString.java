import java.util.Stack;

public class ReverceString {
    public static void main(String[] args) {
        
    }

    public static String reverceString(String str){
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
        stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
        reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
