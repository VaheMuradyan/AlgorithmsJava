import java.util.Iterator;
import java.util.TreeMap;

public class CodeSignal1 {
    public static void main(String[] args) {
        System.out.println(solution("aabbb"));
    }

    public static boolean solution(String inputString) {
        TreeMap<Character, Integer> charCount = new TreeMap<>();
        
        char [] words = inputString.toCharArray();
    
        for (char c : words) {
        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
      
        char c = charCount.firstKey();

        if(c != 'a' && !charCount.containsKey(--c)){
            return false;
        }

        int num = Integer.MAX_VALUE;
        boolean firstTime = true;

        Iterator<Character> iterator = charCount.keySet().iterator();
        while(iterator.hasNext()){
            char iterChar = iterator.next();
            

            if(firstTime && iterChar != 'a'){
                if(!charCount.containsKey(--iterChar)){
                    return false;
                }
                firstTime = false;
            }else if(!firstTime && !charCount.containsKey(--iterChar)){
                return false;
            }else if(firstTime){
                firstTime = false;
            }

            if(!firstTime && num != Integer.MAX_VALUE){
                iterChar++;
            }

            if(charCount.get(iterChar) <= num){
                num = charCount.get(iterChar);
            }else{
                return false;
            }
        }
        return true;
    }
}

