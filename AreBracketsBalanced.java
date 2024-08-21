import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class AreBracketsBalanced{
    public static void main(String[] args) {
        String s = "";
        String s1 = " ";
        System.out.println(s.toCharArray().length);
        System.out.println(s1.toCharArray().length);
        System.out.println(areBracketsBalanced(" "));  // prints: true
    }

    public static boolean areBracketsBalanced(String inputStr) {
        HashMap<Character, Character> bracketMap = new HashMap<>();

        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');

        Set<Character> openPar = new HashSet<>();

        openPar.add('(');
        openPar.add('[');
        openPar.add('{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inputStr.length(); i++) {
            char character = inputStr.charAt(i);
            if (openPar.contains(character)) {
                stack.push(character);
            } else if (!stack.isEmpty() && character == bracketMap.get(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}