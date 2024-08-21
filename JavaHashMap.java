import java.util.HashMap;

// This is where HashMap shines like a knight in shining armor. With its getOrDefault function, HashMap allows for 
//swift updates. Instead of a laborious search for each word, a HashMap can check and 
//update the count in a constant time — a massive time-saver!
// Problem 1: Build Solution

// Let's break down the code step by step:

//     We create a HashMap called wordCount to store words and their frequencies.
//     using the split method around each space, we split the text into words.
//     Then, for each word, we update the HashMap using the getOrDefault method, 
//which fetches the current count and adds one. If the key is not in the HashMap, it creates the key and assigns it a value of 0.


class JavaHashMap{
    public static void main(String[] args) {
        String text = "Cosmo,is,an,incredible,technical,companion,with,very,strong,skills,in,Algorithms,and,Data,Structures,and,a,great,teacher,for,technical,interviews.";
        // TODO: initialize the counter hashmap
        String[] words = text.split(",");

        HashMap<String, Integer> wordCount = new HashMap<>();

        // TODO: count words

        for (String word : words) {

            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

        }

       // System.out.println(wordCount);
       xntir1();
        
    }

    public static void xntir1(){
        String text = "Java Java Java";

        HashMap<String, Integer> wordCount = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {

            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

        }

        System.out.println(wordCount);
    }

//HashMap lays out items and prices on a neat table. It associates each product name (key) with its price (value). 
//Using the values() method, you can directly access all the prices at once for summation, 
//turning a complex task into a walk in the park.
//Problem 2: Solution Building

// Given a hashmap of items, we will use the loop to traverse the map's values, adding them together into a sum.

    public static void xntir2(){
        HashMap<String, Integer> map = new HashMap<>();


        map.put("a", 10);

        map.put("b", 6);

        map.put("c", 12);


        int sum = 0;

        for (int value : map.values()) {

            sum += value;

        }

        System.out.println(sum);  // 28
    }
}